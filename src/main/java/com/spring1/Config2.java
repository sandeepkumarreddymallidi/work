package com.spring1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class Config2 {
    @Bean
    public Map getdata(){
        Map<Integer,Student> map=new HashMap();
        map.put(1,new Student(101,"sandeep",45));
        map.put(2,new Student(102,"hari",65));
        map.put(3,new Student(103,"ramana",75));
        map.put(4,new Student(104,"harsha",85));
        return map;
    }
}
