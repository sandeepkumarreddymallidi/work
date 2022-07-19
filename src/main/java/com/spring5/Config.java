package com.spring5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public SpellChecker getSpellChecker(){
       return new SpellChecker();
    }
    @Bean(name="textEditor")
    public TextEditor getTextEditor() {
        return new TextEditor(getSpellChecker());
    }
}
