package com.spring3;

import com.spring2.Category;
import com.spring2.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext app=new AnnotationConfigApplicationContext(Configure.class);
        Employe con=app.getBean(Employe.class);
        System.out.println(con.getId()+"  "+con.getName()+"  "+con.getPe().getSalary());
        con.getPe().setSalary(10240);
        System.out.println(con.getId()+"  "+con.getName()+"   "+con.getPe().getSalary());
    }
}
