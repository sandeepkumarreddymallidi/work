package com.spring6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Book getBook(){
        return new Book(101,"java",450);
    }
    @Bean
    public Category getCategory(){
        return  new Category();
    }
}
