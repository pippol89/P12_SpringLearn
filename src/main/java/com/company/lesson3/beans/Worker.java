package com.company.lesson3.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Worker {
    /*@Autowired*/
    private Passport passport;
    @Value(value = "Microsoft")
    private String previousWorkPlace;

    /*@Autowired
    public Worker(Passport passport, @Value(value = "Microsoft") String previousWorkPlace) {
    //public Worker(Passport passport, String previousWorkPlace) {
        this.passport = passport;
        this.previousWorkPlace = previousWorkPlace;
    }*/

    public Passport getPassport() {
        return passport;
    }

    @Autowired
    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public String getPreviousWorkPlace() {
        return previousWorkPlace;
    }

    public void setPreviousWorkPlace(String previousWorkPlace) {
        this.previousWorkPlace = previousWorkPlace;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "passport=" + passport +
                ", previousWorkPlace='" + previousWorkPlace + '\'' +
                '}';
    }
}
