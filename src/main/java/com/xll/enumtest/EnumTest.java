package com.xll.enumtest;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumTest {

    public static void main(String[] args) {

        EnumSet<SensonEnum> set = EnumSet.allOf(SensonEnum.class);
        System.out.println(set);

        EnumSet<SensonEnum> set2 = EnumSet.noneOf(SensonEnum.class);
        System.out.println(set2);

        set.add(SensonEnum.AUTOMER);


    }
}
