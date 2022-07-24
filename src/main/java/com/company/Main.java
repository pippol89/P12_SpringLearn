package com.company;

import com.company.beans.Car;
import com.company.beans.Cat;
import com.company.beans.DatabaseConnection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // контекст для работы через xml
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");

        Car car = applicationContext.getBean("firstBeanCar", Car.class);
        System.out.println(car.getMark() + " " + car.getSpeed());

        Car car2 = applicationContext.getBean("firstBeanCar", Car.class);
        System.out.println(car == car2);

        Car car3 = applicationContext.getBean("secondBeanCar", Car.class);
        System.out.println(car3);


        // контекст для работы через аннотации
        ApplicationContext annContext = new AnnotationConfigApplicationContext("com.company.beans");
        Cat cat = annContext.getBean(Cat.class);
        System.out.println(cat);

        DatabaseConnection databaseConnection = annContext.getBean("dbBean", DatabaseConnection.class);
        System.out.println(databaseConnection);
    }
}
