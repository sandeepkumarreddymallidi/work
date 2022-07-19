package com.spring11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StatelessConfig {
    @Bean
    public StatelessBeanExample getStateless(){
        return new StatelessBeanExample();
    }
    @Bean
    public StatlessBeanBasicLCM getStatelessBean(){
        return new StatlessBeanBasicLCM(getStateless());
    }
}
