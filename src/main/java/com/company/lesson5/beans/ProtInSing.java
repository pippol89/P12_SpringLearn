package com.company.lesson5.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class ProtInSing {
    /*private Prot_2 prot_2;

    public Prot_2 getProt_2() {
        prot_2.printHashCode();
        return prot_2;
    }

    @Autowired
    public ProtInSing(Prot_2 prot_2) {
        this.prot_2 = prot_2;
    }*/

    @Lookup
    public abstract Prot_2 getProt();

    public Prot_2 getProt_2() {
        Prot_2 prot_2 = getProt();
        prot_2.printHashCode();

        Prot_2 prot_22 = getProt();
        prot_22.printHashCode();

        return prot_2;
    }
}
