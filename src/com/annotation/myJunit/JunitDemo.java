package com.annotation.myJunit;

public class JunitDemo {
    @MyBefore()
    public void Before(){
System.out.println("初始化");
    }
    @MyTest()
    public void Student(){
System.out.println("student的测试");
    }

    @MyTest()
    public void teacher(){
        System.out.println("teacher的测试");
    }
    @MyAfter()
    public void After(){
        System.out.println("销毁");
    }
}
