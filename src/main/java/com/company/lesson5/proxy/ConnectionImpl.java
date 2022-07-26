package com.company.lesson5.proxy;

public class ConnectionImpl implements Connection {
    @Override
    public void close() {
        System.out.println("Connection was destroyed.");
    }
}
