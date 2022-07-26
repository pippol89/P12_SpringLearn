package com.company.lesson5.proxy;

public class ProxyConnection implements Connection {
    private Connection connection;

    public ProxyConnection(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void close() {
        ConnectionPool.countOfFreeConnections++;
    }
}
