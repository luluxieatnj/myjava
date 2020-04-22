package com.xll.jdk8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *  将List 收集成 Map， 一定要使用含有参数类型为BinaryOperator，参数名为mergeFunction的方法
 *    并且 先对List元素过滤判空
 */
public class StreamApi1 {
    public static List<Person> personList = Arrays.asList(
                                        new Person("AA", 91.7D),
                                        new Person("BB", 92.7D),
                                        new Person("CC", 93.7D),
                                        new Person("AA", 94.7D));  // 实验数据重复的值
    public static void main(String[] args) {
        // 报错  IllegalStateException: Duplicate key 91.7
//        Map<String, Double> map = personList.stream().collect(Collectors.toMap(Person::getName, Person::getWeight))

        // 指定当key重复是，添加的策略(返回v2，即后面的覆盖前面的)不会报错，94.7会覆盖91.7
        Map<String, Double> map = personList.stream().collect(Collectors.toMap(Person::getName, Person::getWeight, (v1, v2) -> v2));

        // 等同上， toMap第四个参数不指定，默认生成的是HashMap
//        Map<String, Double> map = personList.stream().collect(Collectors.toMap(Person::getName, Person::getWeight, (v1, v2) -> v2, HashMap::new));

        System.out.println(map);

        // 如果personList中含有null，使用toMap会抛出NPE， 可以先进行过滤
        personList.stream()
                .filter(p -> p!=null)
                .collect(Collectors.toMap(Person::getName, Person::getWeight, (v1, v2) -> v2));
    }
}
