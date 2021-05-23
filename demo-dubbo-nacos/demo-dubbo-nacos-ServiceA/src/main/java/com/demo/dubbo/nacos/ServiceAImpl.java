package com.demo.dubbo.nacos;

import com.demo.dubbo.nacos.api.ServiceA;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Auther: zyl
 * @Date: 2021/5/23-22:38
 */
@Service(version = "1.0.0",interfaceClass = ServiceA.class,cluster = "failfast",loadbalance = "roundrobin")
public class ServiceAImpl implements ServiceA {

    public String greet(String name) {
        return "hello "+name;
    }

}