package com.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Iterator;

public class Main2 {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(Config2.class);
        Student s = factory.getBean(Student.class);


    }

    }
