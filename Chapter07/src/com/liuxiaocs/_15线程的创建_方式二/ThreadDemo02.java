package com.liuxiaocs._15线程的创建_方式二;

/**
 * 目标：方式二的匿名内部类写法，简化写法。
 */
public class ThreadDemo02 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "===>" + i);
                }
            }
        }, "线程1").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "===>" + i);
            }
        }, "线程2").start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "===>" + i);
        }
    }
}
