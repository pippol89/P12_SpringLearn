package com.company.lesson6;

public class ConsoleLogger implements Logger {
    @Override
    public void write() {
        System.out.println("We are write information in console");
    }
}
