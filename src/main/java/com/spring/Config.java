package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Student getStudent(){
        return new Student(101,"sandeep kumar",75);
    }
}
