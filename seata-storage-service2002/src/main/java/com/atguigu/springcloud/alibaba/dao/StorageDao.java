package com.atguigu.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zjzstart
 * @create 2023-02-23 10:57
 */
@Mapper
public interface StorageDao {

    void decrease(@Param("productId") Long productId,
                  @Param("count") Integer count);

}
