package com.xll.threadtest.customerproducter;

import com.xll.threadtest.customerproducter.Fruit;

public class ThreadTest01 {

    public static volatile Fruit fruit = new Fruit();

    public static void main(String[] args) {
        fruit.setName("西瓜");

        new Thread(() -> {
            while (true) {
                if (fruit.isExists()) {
                    System.out.println("吃掉");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    fruit.setExists(false);
                }
            }
        }, "p").start();

        new Thread(() -> {
            while (true) {
                if (!fruit.isExists()) {
                    System.out.println("摘一个");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    fruit.setExists(true);
                }
            }
        }, "c").start();

    }
}
