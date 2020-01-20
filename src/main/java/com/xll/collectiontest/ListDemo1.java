package com.xll.collectiontest;

import org.junit.Test;

import java.util.*;

public class ListDemo1 {

    @Test
    public void test01() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        Object[] objects = list.toArray();
        System.out.println(objects.length);
        for (Object o : objects) {
            System.out.println((String)o);
        }
        System.out.println("//////////////////////////////////////");

        String[] ss = new String[list.size()];
        String[] strings = list.toArray(ss);
        System.out.println(Arrays.toString(ss));
        System.out.println(Arrays.toString(strings));

        System.out.println(Objects.equals(ss, strings));
        System.out.println(Objects.deepEquals(ss, strings));
        System.out.println("////////////////////////////////////////");

        String[] strings1 = list.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(strings1));

        System.out.println("////////////////////=======================////////////////////");

        Collections.shuffle(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }

}
