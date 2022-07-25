package com.company.lesson4;

import com.company.lesson4.example.CurrencyBeanPostProcessor;
import com.company.lesson4.example.Dollar;
import com.company.lesson4.example.Euro;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainLesson4 {
    public static void main(String[] args) {
        ApplicationContext appCn = new AnnotationConfigApplicationContext("com.company.lesson4.beans");

        ((AnnotationConfigApplicationContext)appCn).close();


        ApplicationContext appCn2 = new AnnotationConfigApplicationContext(Dollar.class, Euro.class, CurrencyBeanPostProcessor.class);
        System.out.println(appCn2.getBean(Dollar.class));
        System.out.println(appCn2.getBean(Euro.class));
    }
}
