package com.annotation.customizedannotation;

/**
 * (使用)自定义的注解类
 */
/*
@ + 注解的名字（注解的属性）
 */
@Myannotation(value = "class" ,num = 1)
public class Demo {
    @Myannotation(value = "filed", num = {1, 2})
   public  String name;

    @Myannotation(value = "method", num = {1, 2, 3})
    public void A() {
    }

}
