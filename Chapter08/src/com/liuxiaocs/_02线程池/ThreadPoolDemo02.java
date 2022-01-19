package com.liuxiaocs._02线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 目标：创建一个线程池
 *
 * 线程池在Java中的代表类：ExecutorService(接口)
 *
 * Java在Executors类下提供了一个静态方法得到一个线程池的对象：
 *      1.public static ExecutorService newFixedThreadPool(int nThreads):
 *          创建一个线程池返回。
 *
 * ExecutorService提交线程任务对象执行的方法：
 *      1.Future<?> submit(Runnable task): 提交一个Runnable的任务对象交给线程池执行。
 */
public class ThreadPoolDemo02 {
    public static void main(String[] args) {
        // a.创建一个线程池，指定线程的固定数量是3
        ExecutorService pools = Executors.newFixedThreadPool(3);
        // b.添加线程任务让线程池处理。
        Runnable target = new MyRunnable();
        // 第1次提交任务，此时线程池创建新线程
        pools.submit(target);
        // 第2次提交任务，此时线程池创建新线程
        pools.submit(target);
        // 第3次提交任务，此时线程池创建新线程
        pools.submit(target);
        // 第4次提交任务，复用之前的线程
        pools.submit(target);

        // 等线程任务完毕之后关闭线程池
        pools.shutdown();
        // 立即关闭线程池，可能出现任务还没有执行完的情况
        // pools.shutdownNow();
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "==>" + i);
        }
    }
}
