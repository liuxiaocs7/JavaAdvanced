package com.liuxiaocs._09并发包_CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

/**
 * 目标：CyclicBarrier
 *
 * CyclicBarrier作用：
 *      某个线程任务必须等待其他线程执行完毕以后才能最终触发自己执行。
 * 例如：公司召集5名员工开会，等5名员工都到齐了，会议开始。
 *      我们创建5个员工线程，1个开会任务，几乎同时启动
 *      使用CyclicBarrier保证5名员工线程全部执行后，再执行开会线程。
 * 构造器：
 *      public CyclicBarrier(int parties, Runnable barrierAction)
 *      // 用于再线程得到屏障5时，优先执行barrierAction，方便处理更复杂的业务场景
 * 方法：
 *      public int await()
 *      // 每个线程调用await()方法告诉CyclicBarrier我已经到达了屏障，然后当前线程被阻塞
 *
 * 小结：
 *      可以实现多线程中，某个任务在等待其他线程执行完毕以后触发
 *      循环屏障可以实现达到一组屏障就出发一个任务执行
 */
public class CyclicBarrierDemo {
    public static void main(String[] args) {

        // 2.创建一个循环屏障，等到5个线程执行完毕以后触发一次线程任务(开会)
        // 第一个参数是数量，第二个参数是任务
        // 最后一个进入屏障的线程执行这个任务
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5, new Meeting());

        // 1.创建要给任务循环屏障对象
        for(int i = 1; i <= 10; i++) {
            new EmployeeThread("员工" + i, cyclicBarrier).start();
        }
    }
}

class Meeting implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始组织会议");
    }
}

class EmployeeThread extends Thread {

    private CyclicBarrier cyclicBarrier;
    public EmployeeThread(String name, CyclicBarrier cyclicBarrier) {
        super(name);
        this.cyclicBarrier = cyclicBarrier;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + "正在进入会议室");
            // +1 告诉屏障自己到了，自己这个线程阻塞
            // 每个线程调用await方法告诉CyclicBarrier我已经到达了，然后当前线程被回收
            // 这个线程把自己的任务执行完了就被回收而不是阻塞
            cyclicBarrier.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
