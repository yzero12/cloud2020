package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author zjzstart
 * @create 2023-02-16 15:37
 */
public interface LoadBanlancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);

}
