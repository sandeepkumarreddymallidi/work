package com.spring8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config23.class);

        // now both beans A and B will be available...
        A a = ctx.getBean(A.class);
        a.display();
        B b = ctx.getBean(B.class);
        b.dispaly();
    }
}
