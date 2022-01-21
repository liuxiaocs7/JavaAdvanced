package com.liuxiaocs._10并发包_Semaphore;

import java.util.concurrent.Semaphore;

/**
 * 目标：Semaphore的使用介绍
 * 引入：
 *      Semaphore(发信号)的主要作用是控制线程的并发数量。
 *      synchronized可以起到锁的作用，单某个时间段内，只能有一个线程允许执行。
 *      Semaphore可以设置同时允许几个线程执行
 *      Semaphore字面意思是信号量的意思，它的作用是控制访问特定资源的线程数目。
 * Semaphore的构造器：
 *      public Semaphore(int permits): permits表示许可线程的数量
 *      public Semaphore(int permits, boolean fair): fair表示公平性，如果这个设为true
 * Semaphore的方法：
 *      public void acquire() throws InterruptedException 表示获取许可
 *      public void release() release()表示释放许可
 * 小结：
 *      Semaphore可以控制线程并发占锁的数量。(最多能有多少线程能同时抢到锁)
 */
public class SemaphoreDemo {
    public static void main(String[] args) {
        Service service = new Service();
        for(int i = 1; i <= 5; i++) {
            Thread a = new MyThread("线程" + i, service);
            a.start();
        }
    }
}

class MyThread extends Thread {

    private Service service;
    public MyThread(String name, Service service) {
        super(name);
        this.service = service;
    }

    @Override
    public void run() {
        service.login();
    }
}

// 业务代码
class Service {

    private Semaphore semaphore = new Semaphore(2);
    // 1表示许可的意思，表示最多允许1个线程执行 acquire()上锁 和 release()解锁 之间的内容

    // 登录
    public void login() {
        try {
            // +1
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + "进入时间 = " + System.currentTimeMillis());
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + "登录成功！");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "离开时间 = " + System.currentTimeMillis());
            // -1
            semaphore.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
