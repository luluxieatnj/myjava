package com.xll.niotest;

import com.xll.uri.MyEncry;

import java.nio.IntBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class NioTest1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {

        /*IntBuffer buffer = IntBuffer.allocate(16);
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < buffer.capacity(); ++i) {
            buffer.put(random.nextInt(20));
        }

        System.out.println(buffer);

        buffer.flip();

        System.out.println(buffer);*/
        String advdefg = MyEncry.DESencode("15951981905");
        System.out.println(advdefg);

        String s = MyEncry.DESdecode(advdefg);
        System.out.println(s);

    }
}
