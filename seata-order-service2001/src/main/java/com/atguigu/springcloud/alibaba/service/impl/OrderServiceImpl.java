package com.atguigu.springcloud.alibaba.service.impl;

import com.atguigu.springcloud.alibaba.dao.OrderDao;
import com.atguigu.springcloud.alibaba.domain.Order;
import com.atguigu.springcloud.alibaba.service.AccountService;
import com.atguigu.springcloud.alibaba.service.OrderService;
import com.atguigu.springcloud.alibaba.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zjzstart
 * @create 2023-02-22 16:35
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Resource
    private StorageService storageService;

    @Resource
    private AccountService accountService;

    @Override
//    @GlobalTransactional(name = "fsp-create-order",rollbackFor = Exception.class)
    public void create(Order order) {

        //创建订单
        log.info("开始创建订单*********");
        orderDao.create(order);

        log.info("开始扣减库存");
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("扣减库存结束");

        log.info("开始扣减余额");
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("扣减余额结束");

        log.info("开始修改订单状态");
        orderDao.update(order.getId(),0);
        log.info("修改订单状态结束");

        log.info("下单结束*********");



    }
}
