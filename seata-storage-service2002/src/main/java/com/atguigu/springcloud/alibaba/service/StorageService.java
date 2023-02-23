package com.atguigu.springcloud.alibaba.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zjzstart
 * @create 2023-02-23 11:21
 */
public interface StorageService {

    void decrease(@RequestParam("productId") Long productId,
                  @RequestParam("count") Integer count);

}
