package com.liuxiaocs._10内部类_匿名内部类;

/**
 * 目标：匿名内部类的概述。
 *
 * 什么是匿名内部类?
 *      就是一个没有名字的局部内部类、
 *      匿名内部类可以简化代码，也是开发中常用的形式。
 *
 * 匿名内部类的格式：
 *      new 类名|抽象类|接口(形参) {
 *          方法重写
 *      }
 * 匿名内部类的特点：
 *      1.匿名内部类是一个没有名字的内部类。
 *      2.匿名内部类一旦写出来，就会立即创建一个匿名内部类的对象返回。
 *      3.匿名内部类的对象的类型相当于是当前new的那个类型的子类类型。
 *
 * javac 编译会发现匿名内部类是有对应的class文件的
 * 外部类名.内部类名.class
 * 外部类名$1.class
 */
public class Anonymity {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.run();
        a.go();

        Animal animal = new Animal() {
            @Override
            public void run() {
                System.out.println("猫跑得贼快~~~");
            }
        };
        animal.run();
        animal.go();

        Animal a1 = new Animal() {
            @Override
            public void run() {
                System.out.println("狗跑得贼快~~~");
            }
        };
        a1.run();
        a1.go();
    }
}

class Cat extends Animal {
    @Override
    public void run() {
        System.out.println("🐱跑得很快");
    }
}

abstract class Animal {
    public abstract void run();

    public void go() {
        System.out.println("开始go~~~");
    }
}
