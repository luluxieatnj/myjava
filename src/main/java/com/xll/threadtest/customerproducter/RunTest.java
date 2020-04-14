package com.xll.threadtest.customerproducter;

public class RunTest {

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.setName("苹果");

        new ProductFruit(fruit).start();

        new CustomFruit(fruit).start();
    }
}
