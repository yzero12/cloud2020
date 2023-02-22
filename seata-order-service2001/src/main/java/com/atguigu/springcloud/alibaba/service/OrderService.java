package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Param;

/**
 * @author zjzstart
 * @create 2023-02-22 16:32
 */
public interface OrderService {

    void create(Order order);

}
