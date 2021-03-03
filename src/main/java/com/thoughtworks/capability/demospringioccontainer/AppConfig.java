package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Greeting test2(){
        return new GreetingService2();
    }

    @Bean
    public Greeting test1(){
        return new GreetingService();
    }

}
