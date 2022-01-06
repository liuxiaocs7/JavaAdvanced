package com.liuxiaocs._13Objects类的使用;

import com.liuxiaocs._12Object类的详细使用.Student;

import java.util.Objects;

/**
 * 目标：Objects类的使用
 *
 * Objects类与Object类还是继承关系
 * Objects类还是Object类的子类
 * Objects类是从JDK1.7开始之后才有的。
 *
 * Objects类的方法：
 *      1.public static boolean equals(Object a, Object b)
 *          -- 比较两个对象。
 *          -- 底层进行非空判断，从而可以避免空指针异常，更安全
 *          public static boolean equals(Object a, Object b) {
 *              return (a == b) || (a != null && a.equals(b));
 *          }
 *
 *      2.public static boolean isNull(Object obj)
 *          -- 判断变量是否为null,为null返回true，反之！
 */
public class ObjectsDemo {
    public static void main(String[] args) {
        // Student s1 = null;
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(Objects.equals(s1, s2));
        System.out.println(s1.equals(s2));

        // 询问s1是否为null，为null返回true，反之
        System.out.println(Objects.isNull(s1));
        System.out.println(s1 == null);
    }
}
