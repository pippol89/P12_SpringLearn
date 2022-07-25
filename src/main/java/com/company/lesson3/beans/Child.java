package com.company.lesson3.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Child {
    private String name;
    private Parent parent;

    //    @Autowired
    public Child(@Value(value = "Billy") String name/*, Parent parent*/) {
        this.name = name;
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent getParent() {
        return parent;
    }

    @Autowired
    public void setParent(Parent parent) {
        System.out.println("parent.getChild() == null: " + (parent.getChild() == null));
//        System.out.println(parent.getChild() == null);
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", parent=" + parent.getName() +
                '}';
    }
}
