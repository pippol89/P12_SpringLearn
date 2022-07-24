package com.company.reflect.context;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class AnnotationAppContext implements ApplicationContext {
    private Map<String, Object> mapOfBeans = new HashMap<>();

    public AnnotationAppContext(Class... classes) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        for (int i = 0; i < classes.length; i++) {
            if (classes[i].isAnnotationPresent(Component.class)) {
                System.out.println("We are creating bean");

                Object houseObj = classes[i].getDeclaredConstructor().newInstance();
                Component annotation = (Component)classes[i].getAnnotation(Component.class);
                String nameOfCurrentBean = annotation.name();
                mapOfBeans.put(nameOfCurrentBean, houseObj);

                System.out.println("Bean was created");
            }
        }
    }

    @Override
    public Object getBean(String name) {
        return mapOfBeans.get(name);
    }
}
