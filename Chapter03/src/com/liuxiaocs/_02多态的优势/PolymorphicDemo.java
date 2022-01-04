package com.liuxiaocs._02多态的优势;

/**
 * 目标：多态的优劣势。
 *
 * 优势：
 *      1.在多态形式下，右边对象可以实现组件化切换，业务功能也随之改变
 *        便于扩展和维护。可以实现类与类之间解耦。
 *      2.实际开发的过程中，父类类型作为方法形式参数，传递子类对象给方法，
 *        可以传入一切子类对象进行方法的调用，更能体现出多态的扩展性与便利。
 *
 * 劣势：
 *      1.多态形式下，不能直接调用子类特有的功能。编译看左边!!左边
 *        父类中没有子类独有的功能，所以代码在编译阶段就直接报错了!
 *
 * 小结：
 *      记住以上语法！
 */
public class PolymorphicDemo {
    public static void main(String[] args) {
        // 父类类型 对象名称 = new 子类构造器;
        Animal dlam = new Cat();
        dlam.run();
        // dlam.lookDoor();  // 报错了，多态形式下，编译看左边，左边没有特有功能

        Dog taidi = new Dog();
        go(taidi);

        Cat tom = new Cat();
        go(tom);
    }

    // 开发一个游戏，所有动物都可以进来比赛
    // 使用父类类型作为参数，这样子类对象都可以作为参数传入进来
    public static void go(Animal a) {
        System.out.println("开始...");
        a.run();
        System.out.println("结束...");
    }
}

class Dog extends Animal {
    @Override
    public void run() {
        System.out.println("🐕跑得很快");
    }

    // 独有功能
    public void lookDoor() {
        System.out.println("🐕看门");
    }
}

class Cat extends Animal {
    @Override
    public void run() {
        System.out.println("🐱跑得很快");
    }

    // 独有功能
    public void CatchMouse() {
        System.out.println("🐱抓老鼠");
    }
}

class Animal {
    public void run() {
        System.out.println("动物跑 ");
    }
}
