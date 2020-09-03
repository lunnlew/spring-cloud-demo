package com.karoy.eurekaserver;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 配置所有请求必须登录之后才可以访问
        /*
        	此处采用httpBasic认证模式
        */
        http.httpBasic()
                .and()
                .authorizeRequests()
                .anyRequest().authenticated();
    }
}