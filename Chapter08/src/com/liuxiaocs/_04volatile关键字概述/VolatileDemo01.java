package com.liuxiaocs._04volatile关键字概述;

/**
 * 目标：并发编程下，多线程访问变量的不可见性问题。
 *
 * 引入：
 *      多个线程访问共享变量，会出现一个线程修改变量的值后，其他线程看不到最新值的情况。
 *      如下例中子线程修改了值，但是主线程看不到修改后的值。
 *
 * 结论：
 *      并发编程下，多线程修改变量，会出现线程间变量的不可见性。
 *      每个线程都在自己的工作内存中读取数据，相当于自己的一个缓存，速度更快。
 *
 * 不可见性的原因：
 *      每个线程都有自己的工作内存，线程都是从主内存拷贝共享变量的副本值。
 *      每个线程都是在自己的工作内存中操作共享变量的。
 */
public class VolatileDemo01 extends Thread {

    private boolean flag = false;

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
        while(true) {
            if(t.isFlag()) {
                System.out.println("主线程进入执行~~~");
            }
        }
    }
}