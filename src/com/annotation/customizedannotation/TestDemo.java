package com.annotation.customizedannotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 使用反射尝试解析注解
 */
/*
可以通过反射getAnnotation()得到注解.
但是注解的@Retention的retentionPolicy的范围要是Runtime才可以通过反射解析。
因为反射是要读取的class对象的二进制的文件的，所以要想通过反射读取注解，也要写在这个文件中
才可以。
retentionPolicy的范围要是Class，是不行的，这个是将注解写在的是硬盘中，一旦读入
内存中就会擦除。所以一定是在Runtime才可以

读取注解的方法不只反射，也可以是编译器，如@ Override就是的
 */
public class TestDemo {
    public static void main(String[]args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<Demo> demoClass = Demo.class;
        Myannotation annotation = demoClass.getAnnotation(Myannotation.class);
        System.out.println(annotation);
        Field field = demoClass.getField("name");
        Myannotation annotation1 = field.getAnnotation(Myannotation.class);
        System.out.println(annotation1);
        Method a = demoClass.getMethod("A");
        Myannotation annotation2 = a.getAnnotation(Myannotation.class);
        System.out.println(annotation2);




    }

}
