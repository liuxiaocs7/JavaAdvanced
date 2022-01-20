package com.liuxiaocs._05变量不可见性解决;

/**
 * 目标：并发编程下变量不可见性解决
 * 现象：并发编程下，多线程修改变量，会出现线程间变量的不可见性。
 * 解决方法有两种常见方式：
 *      1.加锁
 *          -- 每次加锁会清空线程自己的工作内存，重新读取主内存的最新值。
 *      2.对共享的变量进行volatile关键字修饰
 *          -- volatile修饰的变量可以在多线程并发修改下，实现线程间变量的可见性。
 *          -- 一旦一个线程修改了volatile修饰的变量，另一个线程可以立即取到最新值。
 *
 *
 */
public class VolatileDemo01 extends Thread {

    private volatile boolean flag = false;

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 线程中修改变量
        flag = true;
        System.out.println("flag = " + flag);
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}

class VisibilityDemo {
    public static void main(String[] args) {
        // 1.启动子线程，修改flag的变量为true
        VolatileDemo01 t = new VolatileDemo01();
        t.start();

        // 2.主线程
        // 刚开始的时候子线程里面的flag是false，不会输出内容
        // 后面子线程里面的flag值被修改了，应该会有输出了
        // 但是事实真的如此吗？
        // 可见子线程将flag的值修改为true之后子线程并没有读取到，这个代码不符合常识

        // 方式一：加锁
        // 为什么加锁可以解决可见性问题？
        // 加锁之后会清空工作内存，重新从主内存中拷贝共享变量的最新值
        // while(true) {
        //     // 加锁会清空工作内存，读取主内存中的最新值到工作内存中来
        //     synchronized (VisibilityDemo.class) {
        //         if(t.isFlag()) {
        //             System.out.println("主线程进入执行~~~");
        //         }
        //     }
        // }

        // 方式二：
        // 给共享变量一个volatile修饰，子线程修改之后主线程就可以看到最新的值
        // volatile的原理，子线程修改之后同步到主内存的共享空间，并通知主线程的工作内存中的值已经不是最新的了
        // 主线程修改之后通知所有的工作内存你们的值要失效
        while (true) {
            if (t.isFlag()) {
                System.out.println("主线程进入执行~~~");
            }
        }
    }
}