package com.company.lesson4.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
@Currency
public class Euro {
    @CurrencyField
    private int[] value = {61, 63, 62, 64};

    @Override
    public String toString() {
        return "Euro{" +
                "value=" + Arrays.toString(value) +
                '}';
    }

    @PostConstruct
    public void init() {
        System.out.println("Is PostConstruct by Euro");
    }
}
