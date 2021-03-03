package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON;

@RestController
@Scope(SCOPE_SINGLETON)
public class GreetingController {

    private Greeting greetingService;

    public GreetingController() {
        System.out.println("GreetingController init");
    }


    @GetMapping("/greet")
    public String greet() {
        return greetingService.sayHi();
    }

    @Autowired
    public void setGreetingService(Greeting greetingService2) {
        this.greetingService = greetingService2;
    }
}
