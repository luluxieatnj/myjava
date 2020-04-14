package com.xll.threadtest.tickets;

public class SaleThread extends Thread {

    static int tickets = 100;

    @Override
    public void run() {
        while (true) {
            synchronized ("LOCK") {
                if (tickets > 0) {
                    System.out.println(Thread.currentThread() + "线程出售第" + tickets-- + "张票");
                } else {
                    System.out.println("票已售完");
                    break;
                }
            }
        }
    }
}
