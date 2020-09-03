package com.karoy.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "provide",fallback = HelloServiceHystrix.class)
public interface HelloService {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name")String name);

}