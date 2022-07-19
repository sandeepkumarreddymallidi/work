package com.spring3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configure {
    @Bean(autowireCandidate = true)
    public Employe getEmployee(){
        return new Employe(104,"sandeep",new PermanateEmployee(10400));
    }
}
