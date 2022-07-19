package com.spring1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@Configuration
public class Config1 {
    @Bean
    public Electronic getElectronic(){
        Set<String> s=new HashSet() ;
        s.add("oppo");
        s.add("apple");
        s.add("vivo");
        s.add("lg");
        s.add("sony");
        return new Electronic(1,"mobile",s);
    }
}
