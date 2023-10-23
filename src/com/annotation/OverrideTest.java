package com.annotation;

/**
 * @Override是jdk中的一个内置的一个注解
 */
public class OverrideTest extends Parent{
    /*
       1，@Override 是一个注解 ，不会对程序造成影响
       2，注解标注的内容会在编译的时候被检查
       3，@Override的底层：
       @Target(ElementType.METHOD)
       @Retention(RetentionPolicy.SOURCE)
       public @interface Override {
        }

        @interface不是一个接口，表示的是一个注解类
        @Target是一个原注解，标志注解的注解（表示一个注解的使用的范围）


     */
    @Override
    public void A(){
     System.out.println("aaa");
 }

}

class Parent{
    public void A(){

    }
}