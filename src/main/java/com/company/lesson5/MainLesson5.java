package com.company.lesson5;

import com.company.lesson5.beans.Prot;
import com.company.lesson5.beans.ProtInSing;
import com.company.lesson5.beans.Prot_2;
import com.company.lesson5.beans.Sing;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainLesson5 {
    public static void main(String[] args) {
        ApplicationContext appCn = new AnnotationConfigApplicationContext(Sing.class, Prot.class, Prot_2.class, ProtInSing.class);

        Sing bean = appCn.getBean(Sing.class);
        Sing bean2 = appCn.getBean(Sing.class);
        System.out.println(bean == bean2);

        Prot bean3 = appCn.getBean(Prot.class);
        Prot bean4 = appCn.getBean(Prot.class);
        System.out.println(bean3 == bean4);

        ProtInSing protInSing1 = appCn.getBean(ProtInSing.class);
        ProtInSing protInSing2 = appCn.getBean(ProtInSing.class);
        System.out.println(protInSing1 == protInSing2);
        System.out.println(protInSing1.getProt_2() == protInSing2.getProt_2());

    }
}
