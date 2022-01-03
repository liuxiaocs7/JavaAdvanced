package com.liuxiaocs._08接口的基本实现;

/**
 * 目标：接口的基本实现
 *
 * 子类     继承    父类
 * 实现类   实现     接口
 *
 * 类与类是继承关系
 * 类与接口是实现关系。接口是被类实现的。
 * 实现接口的类称为：实现类
 *
 * 类实现接口的格式：
 *      修饰符 class 实现类名称 implements 接口1,接口2,接口3,接口4,...{
 *
 *      }
 *      implements: 类实现接口的关键字
 *
 * 小结：
 *      一个类实现接口，这个称为实现类。
 *      接口是用来被类实现的，实现的关键字是implements，接口可以多实现
 *      一个类实现接口必须重写完接口中全部的抽象方法，否这个这个类要定义成抽象类
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        PingPongMan zjk = new PingPongMan("zjk");
        zjk.run();
        zjk.competition();
    }
}

// 实现类实现接口
class PingPongMan implements SportMan {

    private String name;

    public PingPongMan(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "要跑步训练~~");
    }

    @Override
    public void competition() {
        System.out.println(name + "要参加比赛~~");
    }
}

// 运动员接口：规范
interface SportMan {
    void run();
    void competition();
}
