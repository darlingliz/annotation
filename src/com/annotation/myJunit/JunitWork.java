package com.annotation.myJunit;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class JunitWork {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<JunitDemo> aClass = JunitDemo.class;
        JunitDemo demo = aClass.newInstance();
        Method[] methods = aClass.getMethods();

        ArrayList<Method> beforeArrayList = new ArrayList<>();
        ArrayList<Method> testArrayList = new ArrayList<>();
        ArrayList<Method> afterArrayList = new ArrayList<>();

        for (Method method : methods) {
            if (method.isAnnotationPresent(MyBefore.class)) {
                beforeArrayList.add(method);
            }
            if (method.isAnnotationPresent(MyTest.class)) {
                testArrayList.add(method);

            }
            if (method.isAnnotationPresent(MyAfter.class)) {
                afterArrayList.add(method);

            }
        }

        for (Method test : testArrayList) {
            for (Method before : beforeArrayList) {
                before.invoke(demo);
            }
            test.invoke(demo);

            for(Method after :afterArrayList){
                after.invoke(demo);
            }
        }

    }
}
