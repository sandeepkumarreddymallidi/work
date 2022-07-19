package com.spring2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring2")
public class Config {
    @Bean(name = "book")
    public Book getBook(){
        Book b=new Book();
        b.setBook_id(102);
        b.setBookname("c");
        b.setPrice(67);
        return b;
    }


    @Bean(name = "emp")
    public Category getCategory(){
        return new Category("programming",new Book());


    }
    @Bean(name = "emp2")
    public Category getCategory2(){
        return new Category("programming",new Book());


    }
}
