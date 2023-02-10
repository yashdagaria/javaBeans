package com.example.bean.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.bean.bean.service.UserService;
@Configuration
public class MyConfig {
    @Bean(name={"myBean", "mySecondBean"})
    public UserService getUser() {
        return new UserService();
    }
}
