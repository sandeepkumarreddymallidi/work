package com.spring10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
       ApplicationContext app=new AnnotationConfigApplicationContext(Configs.class);
       app.getBean(ThinkThree.class);
    }
}
