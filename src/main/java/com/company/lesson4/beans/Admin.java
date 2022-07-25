package com.company.lesson4.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Admin {
    @Value(value = "root")
    private String password;
    @Value(value = "root")
    private String name;

    @Override
    public String toString() {
        return "Admin{" +
                "password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @PostConstruct
    public void init() {
        System.out.println("Hello Admin");
    }
}
