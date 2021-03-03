package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON;

/**
 * 缺点1：耦合性高
 * 缺点2；直接从容器中请求依赖项，所以它与控制反转的原理相矛盾
 */
@RestController
@Scope(SCOPE_SINGLETON)
public class GreetingController implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public GreetingController() {
        System.out.println("GreetingController init");
    }

    @GetMapping("/greet")
    public String greet() {
        return applicationContext.getBean(GreetingService.class).sayHi();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

}
