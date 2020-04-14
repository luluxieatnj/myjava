package com.xll.print;

import java.math.BigDecimal;

public class Print {

    public static void main(String[] args) {


        BigDecimal price = new BigDecimal("0.00");
        BigDecimal price2 = new BigDecimal("0");
        BigDecimal price3 = new BigDecimal("0");

        int i = BigDecimal.ZERO.compareTo(price);
        int i2 = BigDecimal.ZERO.compareTo(price2);
        int i3 = BigDecimal.ZERO.compareTo(price3);

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);


    }
}
