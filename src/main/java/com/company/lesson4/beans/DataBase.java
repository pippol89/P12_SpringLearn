package com.company.lesson4.beans;

import org.springframework.stereotype.Component;

@Component
public class DataBase {
    public boolean saveAdmin(Admin admin) {
        //Логика работы с БД
        System.out.println("Save in DB: " + admin);
        return true;
    }

    public void close() {
        //Логика работы с БД
        System.out.println("Connection was closed");
    }
}
