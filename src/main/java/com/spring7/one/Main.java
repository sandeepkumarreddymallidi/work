package com.spring7.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext app=new AnnotationConfigApplicationContext(Config3.class,Config1.class);
        Animal animal=app.getBean(Animal.class);
        animal.display();
        animal.getCats().catDisplay();
    }
}
