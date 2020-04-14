package com.xll.proxy.dynamicproxy;


/**
 *  动态代理客户端
 */
public class ClientDynamicProxy {

    public static void main(String[] args) {
        ITeacher teacherProxy = (ITeacher)TeacherProxyFactory.getProxy(new Teacher());

        teacherProxy.teach();


    }
}
