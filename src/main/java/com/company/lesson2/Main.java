package com.company.lesson2;

import com.company.beans.House;
import com.company.beans.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("configSecondLesson.xml");
        House house = (House) applicationContext.getBean("house");
        System.out.println(house);

        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
        System.out.println(person.getWorkPlaces().getClass().getName());
    }
}
