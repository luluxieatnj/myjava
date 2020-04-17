package com.xll.clz;

/**
 *  Person类    属性私有，  没有getter  setter方法，通过反射获取属性
 */
public class Person {
    private String name;
    private Integer age;


    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
