package com.annotation;

import java.util.ArrayList;
import java.util.List;

/**
 * @SupressWarnning jdk中的一个内置注解
 */
@SuppressWarnings({"all"})
public class SupresswarningTest {
    public static void main(String[]args){
        int i = 0;
         List list = new ArrayList();
         list.add("123");
         list.add(1);

    }
}
