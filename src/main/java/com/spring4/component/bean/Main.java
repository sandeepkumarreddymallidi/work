package com.spring4.component.bean;

import com.spring4.component.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    // Main driver method
    public static void main(String[] args)
    {

        // Using AnnotationConfigApplicationContext
        // instead of ClassPathXmlApplicationContext
        // because we are not using XML Configuration
        ApplicationContext context
                = new AnnotationConfigApplicationContext(Config.class);

        // Getting the bean
        College college = context.getBean(College.class);

        // Invoking the method
        // inside main() method
        college.test();
    }
}
