package com.spring10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configs {
    @Bean
    public ThinkOne getThinkOne(){
        return new ThinkOne();
    }
    @Bean
    public ThinkTwo getThinkTwo(){
        return new ThinkTwo();
    }
    @Bean
    public ThinkThree getThinkThree(){
        return new ThinkThree(getThinkOne(),getThinkTwo());
    }

}
