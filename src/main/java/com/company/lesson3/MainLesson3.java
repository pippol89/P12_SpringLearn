package com.company.lesson3;

import com.company.lesson3.beans.Child;
import com.company.lesson3.beans.Parent;
import com.company.lesson3.beans.Passport;
import com.company.lesson3.beans.Worker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainLesson3 {
    public static void main(String[] args) {
        ApplicationContext appCn = new AnnotationConfigApplicationContext("com.company.lesson3.beans");
        Worker worker = appCn.getBean(Worker.class);
        System.out.println(worker);

        /*Worker worker1 = new Worker(new Passport(), "AMD");
        System.out.println(worker1);*/

        Child child = appCn.getBean(Child.class);
        Parent parent = appCn.getBean(Parent.class);
        System.out.println(child);
        System.out.println(parent);
    }
}
