package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author zjzstart
 * @create 2023-02-18 13:55
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentFallbackService fall back-paymentInfo_OK,/(ćoć)/~~";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentFallbackService fall back-paymentInfo_TimeOut,/(ćoć)/~~";
    }
}
