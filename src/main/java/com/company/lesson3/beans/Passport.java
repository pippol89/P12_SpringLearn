package com.company.lesson3.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Passport {
    @Value(value = "123456")
    private int number;
    @Value(value = "21.09.2010")
    private String dateOfIssue;
    @Value(value = "Jim")
    private String name;

    @Override
    public String toString() {
        return "Passport{" +
                "number=" + number +
                ", dateOfIssue='" + dateOfIssue + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
