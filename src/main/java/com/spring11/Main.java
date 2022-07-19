package com.spring11;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext con=new AnnotationConfigApplicationContext(StatelessConfig.class);
        con.close();
    }
}
