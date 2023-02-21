package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zjzstart
 * @create 2023-02-13 12:43
 */
@Mapper
public interface PaymentDao {

//    增删改查
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
