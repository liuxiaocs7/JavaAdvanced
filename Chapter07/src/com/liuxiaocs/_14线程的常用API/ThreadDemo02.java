package com.liuxiaocs._14线程的常用API;

/**
 * 目标：线程休眠API
 *
 * public static void sleep(long time): 让当前线程休眠多少毫秒再继续执行。
 */
public class ThreadDemo02 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                // 让当前线程休眠1s
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
