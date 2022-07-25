package com.company.lesson4.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
@Currency
public class Dollar {
    @CurrencyField
    private int[] value = {31, 33, 32, 34};

    @Override
    public String toString() {
        return "Dollar{" +
                "value=" + Arrays.toString(value) +
                '}';
    }

    @PostConstruct
    public void init() {
        System.out.println("Is PostConstruct by Dollar");
    }
}
