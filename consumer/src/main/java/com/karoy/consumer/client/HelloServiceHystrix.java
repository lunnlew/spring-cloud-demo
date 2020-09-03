package com.karoy.consumer.client;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceHystrix implements HelloService {

    @Override
    public String hello(String name) {
        return String.format("你的请求失败 %s ....", name);
    }
}