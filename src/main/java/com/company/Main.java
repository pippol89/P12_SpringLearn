package com.company;

import com.company.beans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Car car = applicationContext.getBean("firstBeanCar", Car.class);
        System.out.println(car.getMark() + " " + car.getSpeed());

        Car car2 = applicationContext.getBean("firstBeanCar", Car.class);
        System.out.println(car == car2);

        Car car3 = applicationContext.getBean("secondBeanCar", Car.class);
        System.out.println(car3);
    }
}
