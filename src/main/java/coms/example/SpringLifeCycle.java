package coms.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class SpringLifeCycle implements InitializingBean, DisposableBean, Employee{

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("Perform tasks while initializing Bean");

    }
    @Override
    public void destroy() throws Exception {

        System.out.println("Perform tasks before destroying of Bean");

    }
    @Override
    public void doWork() {
        System.out.println("Manage branch office");
    }
}