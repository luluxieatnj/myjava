package com.xll.invoke;

import com.xll.entity.Human;
import com.xll.entity.Man;

/**
 *  通过运行时类Class创建对象
 */
public class InvokeTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class<Man> clz = com.xll.entity.Man.class;

        Human h1 = clz.newInstance();

        h1.init();
    }
}
