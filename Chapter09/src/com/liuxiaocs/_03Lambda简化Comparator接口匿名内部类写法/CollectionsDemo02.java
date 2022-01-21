package com.liuxiaocs._03Lambda简化Comparator接口匿名内部类写法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 目标：Lambda简化Comparator接口匿名内部类写法
 */
public class CollectionsDemo02 {
    public static void main(String[] args) {
        List<Student> lists = new ArrayList<Student>();
        Student s1 = new Student("李铭",18,'男');
        Student s2 = new Student("冯龙",23,'男');
        Student s3 = new Student("王乐乐",21,'男');
        Collections.addAll(lists, s1, s2, s3);

        // 按照年龄进行升序排序！
        Collections.sort(lists, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(lists);

        // 1.匿名内部类去掉多余内容：
        Collections.sort(lists, (Student a, Student b) -> { return a.getAge() - b.getAge(); });

        // 2.类型可以省略
        // 参数类型可以省略，因为类型是固定的了，在这里只能是学生类型了
        Collections.sort(lists, (a, b) -> { return a.getAge() - b.getAge(); });

        // 3.只有一个return语句可以继续省略return
        // 省略大括号，return，分号
        Collections.sort(lists, (a, b) -> a.getAge() - b.getAge());

        // 4.使用方法引用
        Collections.sort(lists, Comparator.comparingInt(Student::getAge));
        System.out.println(lists);
    }
}
