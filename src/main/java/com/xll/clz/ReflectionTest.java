package com.xll.clz;

public class ReflectionTest {

    public static void main(String[] args) {
        Class clz = null;
        try {
            clz = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            System.out.println("未找到此类！！");
        }

        System.out.println(clz.getName());


        Object s = null;
        try {
            s = clz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


        System.out.println(s.toString());


    }
}
