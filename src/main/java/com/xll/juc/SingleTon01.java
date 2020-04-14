package com.xll.juc;

public class SingleTon01 {
    private static /*volatile*/  SingleTon01 INSTANCE;

    private SingleTon01() {}

    public static SingleTon01 getInstance(){
        if (INSTANCE == null) {
            synchronized (SingleTon01.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingleTon01();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                SingleTon01 instance = SingleTon01.getInstance();
                System.out.println(instance.hashCode());
            }).start();
        }
    }
}
