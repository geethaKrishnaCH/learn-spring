package com.learneasy.learnspringframework;

import com.learneasy.learnspringframework.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // 1. Create a configuration class and a bean

        // 2. Initialize the spring context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 3. Retrieve the beans
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));
        // error will be thrown
        // System.out.println(context.getBean(HelloWorldConfiguration.Address.class));

    }

}
