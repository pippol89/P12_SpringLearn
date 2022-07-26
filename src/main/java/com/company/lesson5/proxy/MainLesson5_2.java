package com.company.lesson5.proxy;

public class MainLesson5_2 {
    public static void main(String[] args) {
        Connection connection = ConnectionPool.getConnection();
        connection.close();
    }
}
