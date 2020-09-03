package com.karoy.provide;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return String.format("hello %s you access to is : %s", name, port);
    }
}