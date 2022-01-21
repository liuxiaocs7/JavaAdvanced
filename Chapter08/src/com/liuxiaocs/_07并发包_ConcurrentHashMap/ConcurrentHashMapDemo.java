package com.liuxiaocs._07并发包_ConcurrentHashMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 目标：并发包的介绍。
 *
 * 并发包的来历：
 *      在实际开发中如果不需要考虑线程安全问题，大家不需要做线程安全，因为如果做了反而性能不好，
 *      但是开发中有很多业务是需要考虑线程安全问题的，此时就必须考虑了。否则业务出现问题。
 *      Java为很多业务场景提供了性能优异，且线程安全的并发包，程序员可以选择使用！
 *
 * Map集合中的经典集合：HashMap它是线程不安全的，性能好
 *      -- 如果要求线程安全的业务情况下就不能用这个集合做Map集合，否则业务会崩溃~
 * 为了保证线程安全，可以使用Hashtable。注意：线程中加入了计时
 *      -- Hashtable是线程安全的Map集合，但是性能较差！(已经被淘汰，虽然安全，但是性能)
 * 为了保证线程安全，再看ConcurrentHashMap(不止线程安全，而且效率高，性能好，最新最好)
 *      -- ConcurrentHashMap保证了线程安全，综合性能好！
 *
 * 小结：
 *      HashMap是线程不安全，性能好
 *      Hashtable锁整个集合，线程安全，性能较差
 *      ConcurrentHashMap线程安全，性能得到了极大提升！分段式锁，只锁自己操作的元素位置，综合性能最好，建议并发下使用
 *
 */
public class ConcurrentHashMapDemo {
    // 需求：演示HashMap在高并发下的线程不安全性
    // public static Map<String, String> maps = new HashMap<>();  // 线程不安全
    // public static Map<String, String> maps = new Hashtable<>();   // 线程安全，性能较差，所有的方法都加了锁
    public static Map<String, String> maps = new ConcurrentHashMap<>();   // 线程安全，性能得到了极大提升

    public static void main(String[] args) {
        Runnable target = new MyRunnable();
        Thread t1 = new Thread(target, "线程1");
        Thread t2 = new Thread(target, "线程2");

        t1.start();
        t2.start();

        // 让两个子线程先跑完
        // t1和t2仍然会抢CPU，只有两个都执行完才会执行主线程，这两个都来插队了
        try {
            // 让t1跑完，主线程不能竞争t1的CPU
            t1.join();
            // 让t2跑完，主线程不能竞争t2的CPU
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 等两个线程执行完毕以后去获取集合最终的元素个数：1000000
        System.out.println("元素个数：" + maps.size());
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 500000; i++) {
            ConcurrentHashMapDemo.maps.put(Thread.currentThread().getName() + i, Thread.currentThread().getName() + i);
        }
        long end = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + "耗时: " + (end - start) / 1000.0 + "s");
    }
}

