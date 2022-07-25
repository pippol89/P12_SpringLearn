package com.company.lesson3.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Family {
    private Child child;
    private Parent parent;

    @Autowired
    public Family(Child child, Parent parent) {
        this.child = child;
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Family{" +
                "child=" + child +
                ", parent=" + parent +
                '}';
    }
}
