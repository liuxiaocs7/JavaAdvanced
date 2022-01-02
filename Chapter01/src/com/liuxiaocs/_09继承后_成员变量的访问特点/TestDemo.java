package com.liuxiaocs._09继承后_成员变量的访问特点;

/**
 * 目标：继承后成员变量的访问特点
 * <p>
 * 就近原则：
 *      子类有就找子类，子类没有找父类，父类没有就报错
 *
 * 小结：
 *      this代表了当前对象的引用，可以用于访问当前子类对象的成员变量
 *      super代表了父类对象的引用，可以用于访问父类中的成员变量
 */
public class TestDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.show();
    }
}

class Animal {
    // 如果子类没有name这个字段那么可以访问父类的这个同名字段
    public String name = "动物名称";

}

class Cat extends Animal {
    // 如果子类有name这个字段那么优先访问子类的名称
    public String name = "子类名称";

    public void show() {
        String name = "局部名称";
        System.out.println(this.name);  // 子类名称
        System.out.println(super.name);  // 父类名称
    }
}
