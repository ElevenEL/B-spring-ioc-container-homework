package com.thoughtworks.capability.demospringioccontainer;

public class GreetingService2 implements Greeting {
    public GreetingService2() {
        System.out.println("GreetingService2 init");
    }

    @Override
    public String sayHi() {
        return "hi world";
    }
}
