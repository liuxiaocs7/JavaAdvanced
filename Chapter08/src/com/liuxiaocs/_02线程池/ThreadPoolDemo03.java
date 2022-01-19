package com.liuxiaocs._02线程池;

import java.util.concurrent.*;

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
 *      2.Future<?> submit(Callable task): 提交一个Runnable的任务对象交给线程池执行。
 *
 * 小结：
 *      Callable做线程池的任务可以得到线程执行的结果
 */
public class ThreadPoolDemo03 {
    public static void main(String[] args) {
        // a.创建一个线程池，指定线程的固定数量是3
        ExecutorService pools = Executors.newFixedThreadPool(3);
        // b.提交Callable的任务对象返回一个未来任务对象！
        Future<String> t1 = pools.submit(new MyCallable(100));
        Future<String> t2 = pools.submit(new MyCallable(200));
        Future<String> t3 = pools.submit(new MyCallable(300));
        Future<String> t4 = pools.submit(new MyCallable(400));

        // 3.获取线程池执行的任务的结果
        try {
            String rs1 = t1.get();
            String rs2 = t2.get();
            String rs3 = t3.get();
            String rs4 = t4.get();
            System.out.println(rs1);
            System.out.println(rs2);
            System.out.println(rs3);
            System.out.println(rs4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyCallable implements Callable<String> {

    // 需求，使用线程池，计算出1-100， 1-200， 1-300的和返回
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return Thread.currentThread().getName() + "执行的结果是：" + sum;
    }
}
