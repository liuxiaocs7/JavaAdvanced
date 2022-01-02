package com.liuxiaocs._07继承的使用案例;

/**
 * 目标：继承的使用案例
 *
 * 案例(教务系统)
 *      学生类(姓名，年龄，吃饭，特有功能：学习)
 *      老师类(姓名，年龄，吃饭，特有功能：授课)
 *      班主任(姓名，年龄，吃饭，特有功能：管理)
 *
 * 问题：
 *      如果直接定义类会出现大象系统属性相同行为的重复代码
 *      企业开发中不允许有太多冗余代码
 * 解决思路：
 *      把相同的属性和行为定义在一个父类中，然后让子类继承即可
 *
 * 父类：People类(姓名，年龄，吃饭)
 * 学生类 (特有功能：学习)
 * 老师类 (特有功能：授课)
 * 班主任 (特有功能：管理)
 *
 * 小结：
 *      继承的优势可以把相同的代码定义在父类中，子类可以直接继承使用
 *      这样就可以提高代码的复用性：相同代码只需要在父类中写一次就可以了
 */
public class TestMain {

    public static void main(String[] args) {
        Teacher boNiu = new Teacher();

        // 调用继承父类的
        boNiu.setName("播妞");
        boNiu.setAge(18);
        System.out.println(boNiu.getName());
        System.out.println(boNiu.getAge());
        boNiu.eat();

        // 调用子类自己的
        boNiu.teach();
    }
}
