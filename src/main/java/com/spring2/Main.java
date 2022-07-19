package com.spring2;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext app=new AnnotationConfigApplicationContext(Config.class);
        Category con=(Category) app.getBean("emp2");
        System.out.println(con.getCategoryname()+"  "+con.getJava().getBook_id()+"  "+con.getJava().getBookname()+"  "+con.getJava().getPrice());
        Category con2=(Category) app.getBean("emp");
        System.out.println(con2.getCategoryname()+"  "+con2.getJava().getBook_id()+"  "+con2.getJava().getBookname()+"  "+con2.getJava().getPrice());



    }
}
