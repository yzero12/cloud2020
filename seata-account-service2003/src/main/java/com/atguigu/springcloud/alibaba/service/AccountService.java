package com.atguigu.springcloud.alibaba.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author zjzstart
 * @create 2023-02-23 12:40
 */
public interface AccountService {

    void decrease(@RequestParam("userId") Long userId,
                  @RequestParam("money") BigDecimal money);

}
