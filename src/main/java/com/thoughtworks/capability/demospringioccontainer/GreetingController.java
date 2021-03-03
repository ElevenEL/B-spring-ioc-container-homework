package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON;

@RestController
@Scope(SCOPE_SINGLETON)
public class GreetingController {

    public GreetingController() {
        System.out.println("GreetingController init");
    }

    @GetMapping("/greet")
    public String greet() {
        return getGreetingService().sayHi();
    }

    @Lookup
    public GreetingService getGreetingService() {
        return null;
    }
}
