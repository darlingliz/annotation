package com.annotation.customizedannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解类
 */
/*
 *使用javap Myannotation 反编译Myannotation
  public interface com.annotation.customizedannotation.Myannotation extends java.lang.annotation.Annotation {
    public abstract java.lang.String value();
    public abstract int[] num();
  发现@interface反编译后是一个interface接口，继承了Annotation
 * 注解的地位和类，接口，枚举是一样的
 * 注解中可以定义方法 如  String value() ，不过我们在使用的时候发现这个value可以赋值
 ，我们更容易将这个理解为属性的赋值 value = "liz"，所以注解和接口还是不一样的。
 * 注解中如何只有一个属性value,那在赋值的时候可以省略 ，直接赋值即可 如 @ Myannotation
 ("liz");
 */

@Target({ElementType.METHOD,ElementType.TYPE,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Myannotation {
    String value() default "default hello";
    int[] num();
}
