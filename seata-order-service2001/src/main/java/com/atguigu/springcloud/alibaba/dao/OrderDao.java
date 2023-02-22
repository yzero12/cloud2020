package com.atguigu.springcloud.alibaba.dao;

import com.atguigu.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zjzstart
 * @create 2023-02-22 16:14
 */
@Mapper
public interface OrderDao {

    //创建订单
    void create(Order order);

    //修改订单状态
    void update(@Param("userId") Long userId,
                @Param("status") Integer status);

}
