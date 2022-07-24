package com.company.beans;

import java.util.List;

public class Person {
    private String name;
    private Address address;
    List<String> workPlaces;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getWorkPlaces() {
        return workPlaces;
    }

    public void setWorkPlaces(List<String> workPlaces) {
        this.workPlaces = workPlaces;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", workPlaces=" + workPlaces +
                '}';
    }
}
