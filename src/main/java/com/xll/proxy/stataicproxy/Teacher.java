package com.xll.proxy.stataicproxy;

public class Teacher implements ITeacher {

    @Override
    public void teach() {
        System.out.println(" 老师正在上课..........");
    }
}
