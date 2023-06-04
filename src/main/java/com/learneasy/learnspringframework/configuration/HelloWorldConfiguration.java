package com.learneasy.learnspringframework.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
    record Person(String name, int age, Address address) {
    }

    public record Address(String city, String street) {
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
        return new Person("Geetha", 25, new Address("Hyderabad", "Kothaguda"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address2) {
        return new Person(name, age, address2);
    }

    @Bean(name = "address")
    public Address address() {
        return new Address("Hyderabad", "Anjaiah Nagar");
    }

    @Bean(name = "address2")
    public Address address2() {
        return new Address("Hyderabad", "Durgam Cheruvu");
    }
}
