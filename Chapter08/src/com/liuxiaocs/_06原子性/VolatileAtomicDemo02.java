package com.liuxiaocs._06原子性;

/**
 * 目标：保证原子性操作的方案。
 *
 * 方案一：加锁
 * 加锁不需要加volatile
 *
 * 加锁机制性能较差
 */
public class VolatileAtomicDemo02 {
    public static void main(String[] args) {
        Runnable target = new MyRunnable02();

        // 启动100个线程执行100次任务
        for (int i = 1; i <= 100; i++) {
            new Thread(target).start();
        }
    }
}

class MyRunnable02 implements Runnable {

    private int count;

    // 一次任务是一个整体，加100
    @Override
    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 100; i++) {
                count++;
                System.out.println("count =================> " + count);
            }
        }
    }
}
