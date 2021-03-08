package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringIocContainerApplication implements ApplicationRunner {

	private final GreetingService greetingService;

	public DemoSpringIocContainerApplication(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringIocContainerApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(greetingService.sayHi());
	}
}
