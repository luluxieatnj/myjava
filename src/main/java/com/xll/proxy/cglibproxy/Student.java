package com.xll.proxy.cglibproxy;

/**
 *  学生类， 不需要实现接口，也能呗代理
 */
public class Student {

    public String study(String name) {
        System.out.println("学生" + name + "正在学习...........");

        return "姓名 = " + name;
    }
}
