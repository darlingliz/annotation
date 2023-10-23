package com.annotation;

/**
 * deprecated是jdk中的一个内置的注解
 */
public class DeprecatedTest {
    public static void main(String[]args){
        Person person = new Person();
        //使用这个方法给了一个警告，说是过时了
        person.connectBYLetter();


    }

}
class Person{
    /*
    1，@deprecated的底层：
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
     @Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
     public @interface Deprecated {
}
constructor构造器 field 字段（属性）local_variable（局部变量）parameter(参数) type（类）

     2.可以作为的是一个版本的过渡

     */
    @Deprecated
    public void connectBYLetter(){

    }
}
