package com.xll.juc.tl;

import java.util.concurrent.*;

public class UserInfoUtil {
    private static ThreadLocal<String> tl = new ThreadLocal<>();

    public static String getUserInfo() {
        String name = tl.get();
        if (name == null) {
            name = Thread.currentThread().getName();
            tl.set(name);
        }
        return name;
    }

    public static void remove() {
        tl.remove();
    }


    public static void main(String[] args) {

//        ThreadPoolExecutor executor = new ThreadPoolExecutor(3, 5, 10, TimeUnit.SECONDS, new LinkedBlockingDeque<>());

        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 1; i <= 100; i++) {
            executor.execute(() -> {
                String userInfo = UserInfoUtil.getUserInfo();
                System.out.println(userInfo);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {

                }
//                UserInfoUtil.remove();
            });
        }
        executor.shutdown();
    }
}
