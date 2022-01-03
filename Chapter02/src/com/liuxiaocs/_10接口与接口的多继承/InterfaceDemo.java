package com.liuxiaocs._10接口与接口的多继承;

/**
 * 目标：接口与接口的多继承。
 *
 * 引入：
 *      类与类是单继承关系：一个类只能继承一个直接父类
 *      类与接口是多实现关系：一个类可以同时实现多个接口
 *      接口与接口是多继承关系：一个接口可以同时继承多个接口
 */
public class InterfaceDemo {
}

class PingPongMan implements SportMan {
    @Override
    public void run() {

    }

    @Override
    public void competition() {

    }

    @Override
    public void rule() {

    }

    @Override
    public void abroad() {

    }
}

// SportMan接口将Law接口和Go接口合并成了同一个接口
// 接口与接口的多继承，用一个接口合并多个接口
interface SportMan extends Law, Go{
    void run();
    void competition();
}

interface Law {
    void rule();
}

interface Go {
    void abroad();
}

