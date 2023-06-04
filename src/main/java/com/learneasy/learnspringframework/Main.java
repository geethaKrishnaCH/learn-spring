package com.learneasy.learnspringframework;

import com.learneasy.learnspringframework.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // 1. Create a configuration class and a bean

        // 2. Initialize the spring context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 3. Retrieve the bean
        System.out.println(context.getBean("name"));

    }

}
