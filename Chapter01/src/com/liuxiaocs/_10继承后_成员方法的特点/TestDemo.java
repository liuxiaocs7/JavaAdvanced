package com.liuxiaocs._10继承后_成员方法的特点;

/**
 * 目标：继承后-成员方法的访问特点
 * <p>
 * 就近原则：
 *      子类有就找子类，子类没有找父类，父类没有就报错
 *
 * 小结：
 *      子类对象优先使用子类已有的方法
 */
public class TestDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run();  // 子类的
        cat.eat();  // 父类的
    }
}

class Animal {

    public void run() {
        System.out.println("动物可以跑~~~");
    }

    public void eat() {
        System.out.println("吃东西~~~");
    }

}

class Cat extends Animal {

    @Override
    public void run() {
        System.out.println("🐱跑得贼快~~~");
    }
}
