package com.xll.jdk8.streamapi;


import java.util.*;
import java.util.stream.Collectors;

/**
 *  测试streamAPI
 */
public class StreamApi2 {

    public static List<Employee> employees = Arrays.asList(
            new Employee(10, "康凡雁", 7900.00D, Status.VACATION),
            new Employee(20, "马佳天", 8900.00D, Status.NORMAL),
            new Employee(30, "许初晴", 9200.00D, Status.TRAVEL),
            new Employee(40, "代容业", 6130.00D, Status.NORMAL),
            new Employee(10, "张雪", 5000.00D, Status.NORMAL),
            new Employee(20, "仲秋香", 6000.00D, Status.TRAVEL),
            new Employee(30, "欧阳锦欣", 4500.00D, Status.NORMAL),
            new Employee(10, "王磊", 8000.00D, Status.NORMAL),
            new Employee(40, "庆听芹", 7500.00D, Status.VACATION),
            new Employee(10, "万苑博", 8300.00D, Status.NORMAL),
            new Employee(10, "陈鸿哲", 5500.00D, Status.TRAVEL)
    );


    public static void main(String[] args) {
//        test01();  //  过滤工资大于7000的员工
//        test02(); //  按照部门分组
        test03();  // 工资分析

    }

    /**  工资分析  */
    public static void test03() {
        Double sum = employees.stream().collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println("工资总和: " + sum + "   使用collect收集");

        Optional<Double> sum2 = employees.stream().map(Employee::getSalary).reduce(Double::sum);
        System.out.println("工资总和: " + sum2.orElse(null) + "   使用reduce归约");

        Optional<Employee> minEmployee = employees.stream().collect(Collectors.minBy((e1, e2) -> e1.getSalary() >= e2.getSalary() ? 1 : -1));
        System.out.println("最小工资: " + minEmployee.orElse(new Employee()).getSalary());

        Optional<Double> maxSalary = employees.stream().map(Employee::getSalary).collect(Collectors.maxBy((v1, v2) -> v1 > v2 ? 1 : -1));
        System.out.println("最大工资: " + maxSalary.orElse(null));

        Double averagingDouble = employees.stream().map(Employee::getSalary).collect(Collectors.averagingDouble(Double::doubleValue));
        System.out.println("平均工资: " + String.format("%.2f", averagingDouble));  // 保留两位小数
    }

    /**  按照部门分组  */
    public static void test02() {
        Map<Integer, List<Employee>> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getEmpNo));
        collect.forEach((k, v) -> {
            System.out.print(k + ": ");
            System.out.print(v);
            System.out.println();
        });
    }

    /**  过滤工资大于7000的员工  */
    public static void test01() {
        employees.stream()
                .filter(e -> e.getSalary() > 7000D)
                .forEach(System.out::println);
    }
}
