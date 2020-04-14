package com.xll.proxy.stataicproxy;

/**
 *   静态代理
 *     教师代理类
 */
public class TeacherProxy implements ITeacher {

    // 目标类
    private ITeacher teacher;

    /*
        步骤一：构造器中传入一个ITeacher类型参数
     */
    public TeacherProxy(ITeacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public void teach() {
        System.out.println("TeacherProxy  代理类开始代理......");

        // 步骤2.目标类调用方法，  前后添加自己的逻辑
        teacher.teach();

        System.out.println("TeacherProxy  代理类代理结束......");
    }
}
