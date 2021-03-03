package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

@Service
public class GreetingService implements Greeting {

    public GreetingService() {
        System.out.println("GreetingService init");
    }

    @Override
    public String sayHi() {
        return "hello world";
    }


}
