package coms.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main4 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config4.class);
        Employee employee = (Employee) context.getBean(SpringLifeCycle.class);
        employee.doWork();
        context.close();
    }
}
