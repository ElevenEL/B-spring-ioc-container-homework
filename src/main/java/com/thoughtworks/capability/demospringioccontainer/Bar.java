package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Bar {

    private final Foo foo;

    public Bar(@Lazy Foo foo) {
        this.foo = foo;
    }

    public void hi() {
        System.out.println("Hi, " + foo.name());
    }

    public String name() {
        return "Bar";
    }
}
