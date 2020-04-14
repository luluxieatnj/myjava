package com.xll.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *  代理工厂
 */
public class TeacherProxyFactory {

    public static Object getProxy(Object target) {

        /*
         *      使用Proxy类的静态方法创建代理实例
         *     public static Object newProxyInstance
         *     (ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
         */
        Object proxyInstance = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //  具体业务代码
                System.out.println("动态代理开始.......");
                method.invoke(target, args);
                System.out.println("动态代理结束");
                return null;
            }
        });

        return proxyInstance;
    }

}
