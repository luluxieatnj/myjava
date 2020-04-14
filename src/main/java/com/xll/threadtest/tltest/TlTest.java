package com.xll.threadtest.tltest;

import java.util.concurrent.*;

public class TlTest {

    public static void main(String[] args) {

//        new Thread(new MyThread(), "aa").start();
//        new Thread(new MyThread(), "bb").start();
//        new Thread(new MyThread(), "cc").start();


//        new ThreadPoolExecutor();

//        ExecutorService executorService = Executors.newFixedThreadPool(2);


//        Runnable();

//        ThreadFactory
//        new ThreadPoolExecutor();

//        ThreadPoolExecutor tpExecutor = null;

        ExecutorService executorService = new ThreadPoolExecutor(2, 4, 1000, TimeUnit.MILLISECONDS, new SynchronousQueue());


        try {
            for (int i = 0; i < 5; i++) {

                executorService.execute(() -> {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName());
                });
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            executorService.shutdown();
        }



    }
}
