package com.spring9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception
        {
            ConfigurableApplicationContext cap
                    = new AnnotationConfigApplicationContext(HelloWorld.class);
            //cap.close();

                    }
    }
