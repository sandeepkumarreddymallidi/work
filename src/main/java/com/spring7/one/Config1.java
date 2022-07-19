package com.spring7.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
class Config3{
@Bean
    public Cat getCat(){
    return new Cat();
}
}
@Configuration
public class Config1 {
//@Autowired Config3 config3;
    @Autowired Config3 cat;
@Bean
    public Animal getAnimal(){
    System.out.println("it is config1");
    //cats.catDisplay();
    return new Animal(cat.getCat());//fully qualified bean reference

}
}
