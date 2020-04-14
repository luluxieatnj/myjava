package com.xll.proxy.cglibproxy;

/**
 *  本次案例
 *     设计一个日志代理工厂，被代理的类在调用方法时，都会被记录下来
 *     LoggerProxyFactory
 *
 */
public class ClientCglibProxy {

    public static void main(String[] args) {

        // 使用代理工厂获得代理对象
        Student studentProxy = (Student)new LoggerProxyFactory(new Student()).getProxyInstance();

        // 代理调用, 并返回返回值
        String result = studentProxy.study("小明同学");

        System.out.println(result);
    }
}
