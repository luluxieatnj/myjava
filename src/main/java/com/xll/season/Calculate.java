package com.xll.season;

public class Calculate {

    public static void main(String[] args) {
        call1((a, b) -> (a + b));
        call1((a, b) -> (a * b));
        call2((a, b) -> (a - b) , 6, 2);

    }

    public static void call1(Calculator calculator) {

        int cal = calculator.cal(5, 6);
        System.out.println("结果是: " + cal);
    }


    public static void call2(Calculator calculator, int a, int b) {

        int cal = calculator.cal(a, b);
        System.out.println("结果是: " + cal);
    }
}
