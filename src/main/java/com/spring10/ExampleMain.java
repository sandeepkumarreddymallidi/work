package com.spring10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExampleMain {
    public static void main(String[] args) {
        ApplicationContext app=new AnnotationConfigApplicationContext(ExampleConfig.class);
        app.getBean(Example2.class).dispaly();
    }
}
