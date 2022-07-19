package com.spring10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ValuesMain {
    public static void main(String[] args) {
        System.out.println(new AnnotationConfigApplicationContext(ValueConfigs.class).getBean(Values.class).getAge());

    }
}
