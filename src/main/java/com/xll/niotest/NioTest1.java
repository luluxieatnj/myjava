package com.xll.niotest;

import java.nio.IntBuffer;
import java.security.SecureRandom;

public class NioTest1 {
    public static void main(String[] args) {

        IntBuffer buffer = IntBuffer.allocate(16);
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < buffer.capacity(); ++i) {
            buffer.put(random.nextInt(20));
        }

        System.out.println(buffer);

        buffer.flip();

        System.out.println(buffer);

    }
}
