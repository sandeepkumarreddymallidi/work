package com.spring1;

import com.spring1.Config1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(Config1.class);
        Electronic s = factory.getBean(Electronic.class);
        System.out.println(s.getProduct_id()+" "+s.getProduct_name()+" "+s.getBrands());
        Iterator<String> iterator =s.getBrands().iterator();
        while(iterator.hasNext()){
            System.out.print("  "+iterator.next());
        }
    }
}
