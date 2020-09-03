package com.karoy.cloudadminclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudAdminClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudAdminClientApplication.class, args);
    }

}
