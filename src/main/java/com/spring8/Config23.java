package com.spring8;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
@Configuration
@Import(ConfigA.class)
public class Config23 {

        @Bean
        public B b() {
            return new B();
        }
    }

