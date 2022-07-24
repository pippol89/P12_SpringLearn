package com.company.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@PropertySource("classpath:prop.properties")
public class Cat {
    @Value(value = "${cat.name}")
    private String name;
    @Value(value = "${cat.age}")
    private int age;
    @Value("#{'${cat.girls}'.split(',')}")
    private List<String> girls;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", girls=" + girls +
                '}';
    }
}
