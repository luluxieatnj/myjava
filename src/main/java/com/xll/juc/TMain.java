package com.xll.juc;

import java.nio.ByteBuffer;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.locks.ReentrantLock;

public class TMain {

    public static void main(String[] args) {


//        ThreadLocal tl = new ThreadLocal();


     /*   String s = DateUtil.formatDate();
        System.out.println(s);

        System.out.println(DateUtil.getToday());*/

        String s = DateUtil.formatNow("yyyy-MM-dd HH:mm:ss.SSS");

        System.out.println(s);

    }
}
