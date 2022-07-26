package com.company.lesson5.proxy;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    private static List<Connection> connectionList = new ArrayList<>();
    public static int countOfFreeConnections = 5;

    static {
        for (int i = 0; i < countOfFreeConnections; i++) {
            connectionList.add(new ConnectionImpl());
        }
    }

    public static Connection getConnection() {
        return new ProxyConnection(connectionList.get(--countOfFreeConnections));
    }

    public void closeAllConnection() {
        for (int i = 0; i < countOfFreeConnections; i++) {
            connectionList.get(i).close();
        }
    }
}
