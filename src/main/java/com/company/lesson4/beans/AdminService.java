package com.company.lesson4.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class AdminService {
    private Admin admin;
    private DataBase dataBase;

    public AdminService() {
    }

    @PostConstruct
    public void init() {
        dataBase.saveAdmin(admin);
    }

    /*public AdminService(Admin admin, DataBase dataBase) {
        this.admin = admin;
        this.dataBase = dataBase;

        dataBase.saveAdmin(admin);
    }*/

    public Admin getAdmin() {
        return admin;
    }

    @Autowired
    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    @Autowired
    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @PreDestroy
    public void destoy() {
        dataBase.close();
    }
}
