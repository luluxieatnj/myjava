package com.xll.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 *   日志代理
 *      需要实现 MethodInterceptor 接口并且重写  intercept方法
 */
public class LoggerProxyFactory implements MethodInterceptor {

    // 目标类， 该类调用方法会记录日志
    private Object target;

    public LoggerProxyFactory(Object target) {
        this.target = target;
    }

    // 获取该目标类的代理对象   4 步
    public Object getProxyInstance() {
        // 1.创建工具类
        Enhancer enhancer = new Enhancer();
        // 2.设置父类
        enhancer.setSuperclass(target.getClass());
        // 3.设置回调函数
        enhancer.setCallback(this);
        // 4.创建子类，即代理对象
        return enhancer.create();
    }

    /**
     *  代理业务
     * @param method
     * @param args      方法参数
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始记录日志，方法名 = " + method.getName());
        Object result = method.invoke(target, args);
        System.out.println("记录日志结束，方法返回值是 = " + result);
        return result;
    }

}
