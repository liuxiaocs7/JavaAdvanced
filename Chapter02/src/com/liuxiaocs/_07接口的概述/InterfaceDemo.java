package com.liuxiaocs._07接口的概述;

/**
 * 目标：接口的概述(认识接口)
 *
 * 什么是接口？
 *      接口是更加彻底的抽象，在JDK1.8之前接口中只能是抽象方法和常量
 *      接口体现的是规范思想，实现接口的子类必须重写接口的全部抽象方法
 *
 * 接口的定义格式：(关注语法)
 *      修饰符 interface 接口名称 {
 *          // 在JDK1.8之前接口中只能是抽象方法和常量
 *      }
 *      interface定义接口的核心关键字
 *
 * 接口中成分的研究：
 *      在JDK1.8之前接口中只能是抽象方法和常量
 *
 * 小结：
 *      接口体现的是规范思想
 *      JDK1.8之前接口中只有抽象方法和常量
 *      接口中抽象方法的public abstract可以不写，默认会加上
 *      接口中常量的public static final可以不写，默认会加上
 *      除此之外没有其他成分
 */
public interface InterfaceDemo {
    // 1.抽象方法
    // 接口中的抽象方法可以省略 public abstract 不写，默认会加上！
    // public abstract void run();
    void run();

    // 2.常量：变量值只有一个，而且在程序运行的过程中不可更改
    // 常量一般修饰符是：public static final
    // 常量的变量名称建议字母全部大写，多个单词之间用 "_" 连接
    // 接口中常量是可以省去public static final不写，默认会加上！
    // public static final String SCHOOL_NAME = "黑马";
    String SCHOOL_NAME = "黑马";



}
