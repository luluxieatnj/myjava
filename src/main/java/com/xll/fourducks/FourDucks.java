package com.xll.fourducks;

import org.junit.Test;

import java.util.Arrays;

/**
 * 四个鸭子问题，概率问题
 *
 * 结果 0.16666666666666  约等于  1 / 6
 */
public class FourDucks {

    private static final int sum = 10_000_000;
    private static final int count = 10_000_000;

    @Test
    public void test01() {
        int t = 0;
        for (int i = 0; i < count; i++) {
            if (cal() > sum / 2) {
                t++;
            }
        }
        double r = (double)t / count;
        System.out.println(r);
    }

    private int cal() {
        double[] ds = new double[4];
        double dSum = 0.0d;
        for (int i = 0; i < ds.length; i++) {
            ds[i] = Math.random();
            dSum += ds[i];
        }
        Arrays.sort(ds);
        double x = ds[ds.length - 1] - ds[0];
        return (int) ((x / dSum) * sum);
    }
}
