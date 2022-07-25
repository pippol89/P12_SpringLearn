package com.company.lesson4.example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Arrays;

@Component
public class CurrencyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean.getClass().isAnnotationPresent(Currency.class)) {
            Field[] fields = bean.getClass().getDeclaredFields();

            for (int i = 0; i < fields.length; i++) {
                if (fields[i].isAnnotationPresent(CurrencyField.class)) {
                    fields[i].setAccessible(true);

                    try {
                        sort((int[]) fields[i].get(bean));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    public void sort(int[] mass) {
        Arrays.sort(mass);
    }
}
