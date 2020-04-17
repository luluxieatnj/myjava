package com.xll.clz;

import java.lang.reflect.Field;

public class PersonTest {

    public static void main(String[] args) throws IllegalAccessException {
        Person person = new Person("小明", 18);

//        Class clz = person.getClass();
        Class clz = Person.class;

        Field[] fields = clz.getDeclaredFields();

        for (Field f : fields) {
            f.setAccessible(true);  // 可达的，允许访问私有属性。Person中的私有属性
            String fName = f.getName();
            Object value = f.get(person);
            System.out.println("属性名 = " + fName + ", 属性值 = " + value);
        }
    }
}
