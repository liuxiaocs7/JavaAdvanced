package com.liuxiaocs._01线程通信;

// 取钱线程类
public class DrawThread extends Thread {

    // 定义一个成员变量接收账户对象
    private Account acc;

    public DrawThread(Account acc, String name) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            acc.drawMoney(10000);
        }
    }
}
