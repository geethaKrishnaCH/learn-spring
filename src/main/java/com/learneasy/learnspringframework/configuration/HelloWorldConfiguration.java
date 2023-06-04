package com.learneasy.learnspringframework.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
    record Person(String name, int age) {
    }

    record Address(String city, String street) {
    }

    @Bean
    public String name() {
        return "Geetha";
    }

    @Bean
    public int age() {
        return 25;
    }

    @Bean
    public Person person() {
        return new Person("Geetha", 25);
    }

    @Bean
    public Address address() {
        return new Address("Hyderabad", "Anjaiah Nagar");
    }
}
