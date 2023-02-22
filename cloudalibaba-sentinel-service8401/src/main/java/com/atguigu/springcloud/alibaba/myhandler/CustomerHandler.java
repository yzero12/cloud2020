package com.atguigu.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import org.springframework.stereotype.Component;

/**
 * @author zjzstart
 * @create 2023-02-22 10:14
 */
@Component
public class CustomerHandler {

    public static CommonResult customerHandler1(BlockException blockException){
        return new CommonResult(444,"自定义block",null);
    }

}
