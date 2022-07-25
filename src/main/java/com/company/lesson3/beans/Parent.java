package com.company.lesson3.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Parent {
    private String name;
    private Child child;

    //    @Autowired
    public Parent(@Value(value = "Boris") String name/*, Child child*/) {
        this.name = name;
        this.child = child;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Child getChild() {
        return child;
    }

    @Autowired
    public void setChild(Child child) {
        System.out.println("child.getParent() == null: " + (child.getParent() == null));
//        System.out.println(child.getParent() == null);
        this.child = child;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", child=" + child.getName() +
                '}';
    }
}
