package coms.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Config4 {
    @Bean
    public SpringLifeCycle getLife(){
        return new SpringLifeCycle();
    }

}