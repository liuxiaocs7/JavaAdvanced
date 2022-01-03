package com.liuxiaocs._14final关键字;

/**
 * 目标：final关键字讲解
 *
 * final是最终的含义
 * final可以用于修饰类，方法，变量
 *
 * (1) final修饰类：类不能被继承了
 * (2) final修饰方法：方法不能被重写了
 * (3) final修饰变量，变量有且仅能被赋值一次
 *
 * 拓展：请问abstract和final的关系是什么？互斥关系！不能同时出现修饰成员！
 *
 */
public class FinalDemo01 {
    public static void main(String[] args) {

    }
}

class Animal {
    public final void run() {

    }
}

// class Wolf extends Animal {
//     @Override  // 不能被重写
//     public void run() {
//
//     }
// }

final class Animal1 {

}

// class Cat extends Animal1 {
//
// }
