package com.spring10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleConfig {
    @Bean
    public Example2 getExample2(){
        return new Example2();
    }
}
