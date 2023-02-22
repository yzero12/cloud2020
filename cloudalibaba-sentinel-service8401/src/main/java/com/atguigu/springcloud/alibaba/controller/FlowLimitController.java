package com.atguigu.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.atguigu.springcloud.alibaba.myhandler.CustomerHandler;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zjzstart
 * @create 2023-02-21 15:09
 */
@RestController
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() {
        return "------testB";
    }

    @GetMapping(value = "/customerHandler")
    @SentinelResource(value = "customerHandler", blockHandlerClass = CustomerHandler.class, blockHandler = "customerHandler1")
    public CommonResult customerHandler() {
        return new CommonResult(200, "success", null);
    }
}