package com.company.reflect.context;

import java.lang.reflect.InvocationTargetException;

public class Start {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        /*House house = new House();
        System.out.println(house.getClass().isAnnotationPresent(Component.class));*/

        ApplicationContext applicationContext = new AnnotationAppContext(House.class);
        House house = (House) applicationContext.getBean("house");
        house.sayHello();
    }
}
