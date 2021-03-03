package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON;

@RestController
@Scope(SCOPE_SINGLETON)
public class GreetingController {


    private final ObjectFactory<GreetingService> greetingServiceObjectFactory;

    @Autowired
    public GreetingController(ObjectFactory<GreetingService> greetingServiceObjectFactory) {
        this.greetingServiceObjectFactory = greetingServiceObjectFactory;
        System.out.println("GreetingController init");
    }

    @GetMapping("/greet")
    public String greet() {
        return getGreetingService().sayHi();
    }

    public GreetingService getGreetingService() {
        return greetingServiceObjectFactory.getObject();
    }
}
