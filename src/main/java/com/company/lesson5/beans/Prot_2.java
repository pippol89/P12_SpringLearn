package com.company.lesson5.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Scope(value = "prototype")
public class Prot_2 {
    public void printHashCode() {
        System.out.println("HashCode: " + hashCode());
    }
}
