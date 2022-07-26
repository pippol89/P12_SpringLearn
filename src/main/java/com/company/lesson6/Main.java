package com.company.lesson6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext appCn = new AnnotationConfigApplicationContext(ScanConfig.class);

        Logger logger = appCn.getBean(FileLogger.class);
        logger.write();

        Logger logger2 = appCn.getBean(ConsoleLogger.class);
        logger2.write();
    }
}
