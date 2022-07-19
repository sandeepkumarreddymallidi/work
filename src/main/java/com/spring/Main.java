package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("");
        Student s = factory.getBean(Student.class);
        System.out.println(s.getSid()+" "+s.getName()+" "+s.getMarks()); }}
