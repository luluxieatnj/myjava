package com.xll.proxy.stataicproxy;

/**
 *  静态代理客户端
 */
public class ClientStaticProxy {

    public static void main(String[] args) {

        TeacherProxy teacherProxy = new TeacherProxy(new Teacher());

        teacherProxy.teach();

    }
}
