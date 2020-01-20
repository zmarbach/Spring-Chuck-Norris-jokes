package com.improving.springjokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public ChuckNorrisQuotes getChuckBean(){
        return new ChuckNorrisQuotes();
    }
}
