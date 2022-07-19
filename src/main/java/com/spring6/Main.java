package com.spring6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext app=new AnnotationConfigApplicationContext(Config.class);
        Category con=app.getBean(Category.class);
        System.out.println(con.getCategoryname()+"  "+con.getJava().getBookname()+"  "+con.getJava().getBook_id()+"  "+con.getJava().getPrice());
        con.setCategoryname("programming");
        System.out.println(con.getCategoryname()+"  "+con.getJava().getBookname()+"  "+con.getJava().getBook_id()+"  "+con.getJava().getPrice());
    }
}
