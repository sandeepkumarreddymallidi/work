package coms.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext app=new AnnotationConfigApplicationContext(Config.class);
       MainLogic mal= app.getBean(MainLogic.class);
       mal.selectEx();
      // mal.insertElements();
        System.out.println("--------------------");
       // mal.updateElements();
       // mal.selectEx();
    }
}
