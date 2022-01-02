package com.liuxiaocs._11继承后_方法重写;

/**
 * 目标：静态方法和私有方法是否可以被重写(扩展语法)
 * <p>
 * 可以吗？都不可以，加上@Override都报错！(去掉之后表示子类新的方法)
 */
public class ExtendsDemo03 {
}

class Mac extends Computer {
    // @Override  // 不能被重写
    public void go() {

    }

    public static void test() {

    }
}

class Computer {
    private void go() {

    }

    public static void test() {

    }
}
