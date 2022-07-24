package com.company.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component(value = "dbBean")
@PropertySource("classpath:db.properties")
public class DatabaseConnection {
    @Value("${db.login}")
    private String login;
    @Value("${db.password}")
    private String password;
    @Value("${db.url}")
    private String url;

    @Override
    public String toString() {
        return "DatabaseConnection{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
