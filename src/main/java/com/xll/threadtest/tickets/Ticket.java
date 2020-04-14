package com.xll.threadtest.tickets;

public class Ticket {

    public static void main(String[] args){
        SaleThread t1 = new SaleThread();
        SaleThread t2 = new SaleThread();
        SaleThread t3 = new SaleThread();
        t1.start();
        t2.start();
        t3.start();
    }
}
