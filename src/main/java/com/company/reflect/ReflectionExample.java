package com.company.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionExample {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Method[] methods = Arrays.class.getMethods();
        /*Arrays.stream(methods).forEach(System.out::println);*/
//        for (int i = 0; i < methods.length; i++) {
//            System.out.println(methods[i].getName());
//        }

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world");
            }
        };
        System.out.println(r.getClass().getName());

        /*Runnable r2 = r.getClass().newInstance();*/
        Runnable r2 = r.getClass().getDeclaredConstructor().newInstance();
        r2.run();


        Shape shape = new Shape();
        Field square = shape.getClass().getDeclaredField("square");
        square.setAccessible(true);
        square.set(shape, 5);
        System.out.println(square.get(shape));
    }
}
