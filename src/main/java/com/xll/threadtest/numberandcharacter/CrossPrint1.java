package com.xll.threadtest.numberandcharacter;

/**
 *  循环交替打印   1  A  2  B 3 C .........
 */
public class CrossPrint1 {

    public static int[] arr = {1, 2, 3, 4, 5, 6, 7};
    public static char[] chars = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
    public static boolean b = true;
    public static Object o = new Object();


    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (o) {
                int i = 0;
                while (i < 7) {
                    if (b) {
                        System.out.println(arr[i++]);
                        b = false;
                        o.notify();
                    }
                    try {
                        o.wait();
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(() -> {
            synchronized (o) {
                int i = 0;
                while (i < 7) {
                    if (!b) {
                        System.out.println(chars[i++]);
                        b = true;
                        o.notify();
                    }
                    try {
                        o.wait();
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                }
            }

        }).start();
    }


}
