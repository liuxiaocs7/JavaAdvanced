package com.liuxiaocs._09接口的多实现;

/**
 * 目标：接口的多实现研究。
 *
 * 类与类是单继承关系
 * 类与接口是多实现关系
 *
 * 类实现接口的格式：
 *      修饰符 class 实现类名称 implements 接口1,接口2,接口3,接口4,...{
 *
 *      }
 *      implements: 类实现接口的关键字
 *
 * 小结：
 *      一个类实现多个接口，必须重写完全部接口中的全部抽象方法，否则这个类要定义成抽象类！
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        // 创建实现类对象调用重写的方法执行！
        BasketBall yaoMing = new BasketBall();
        yaoMing.rule();
        yaoMing.run();
        yaoMing.competition();
    }
}

class BasketBall implements SportMan, Law {
    @Override
    public void run() {

    }

    @Override
    public void competition() {

    }

    @Override
    public void rule() {

    }
}

interface SportMan {
    void run();
    void competition();
}

interface Law {
    void rule();
}
