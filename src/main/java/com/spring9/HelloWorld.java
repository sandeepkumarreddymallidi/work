package com.spring9;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld {

    // This method executes
    // automatically as the bean
    // is instantiated
    @PostConstruct
    public void init() throws Exception
    {
        System.out.println(
                "Bean HelloWorld has been "
                        + "instantiated and I'm "
                        + "the init() method");
    }

    // This method executes
    // when the spring container
    // is closed
    @PreDestroy
    public void destroy() throws Exception
    {
        System.out.println(
                "Container has been closed "
                        + "and I'm the destroy() method");
    }
}
