package com.spring11;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
    public class StatlessBeanBasicLCM {

@EJB
        private StatelessBeanExample instance;

    public StatlessBeanBasicLCM(StatelessBeanExample instance)
    {
        this.instance = instance;
    }

    @PostConstruct
        public void init(){
            System.out.println("Post construct callback invoked");
            System.out.println("Injected EJB instance - " + instance.hashCode());
        }

        @PreDestroy
        public void destroy(){
            System.out.println("I am about to be consumed by the GC !");
        }
    }

