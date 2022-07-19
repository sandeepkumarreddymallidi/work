package com.spring10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ValueConfigs {
    @Bean
    public Values getValues(){
        return new Values("sandeep","25");
    }

}
