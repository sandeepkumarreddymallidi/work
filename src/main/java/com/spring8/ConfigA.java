package com.spring8;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
public class ConfigA {
    @Bean
    public A a() {
        return new A();
    }
}
