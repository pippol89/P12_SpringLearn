package com.company.lesson6;

import com.company.reflect.context.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;

@Configuration
//@Component
public class Config {
//    @Autowired
//    File file;

    @Bean
    public Logger fileLogger() {
        return new FileLogger(file());
//        return new FileLogger(file);
    }

    @Bean
    public Logger consoleLogger() {
        return new ConsoleLogger();
    }

    @Bean
    public File file() {
        System.out.println("fffff");
        return new File("");
    }
}
