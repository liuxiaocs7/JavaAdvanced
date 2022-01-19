package com.liuxiaocs._01线程通信;

// 存钱线程类
public class SaveThread extends Thread {

    // 定义一个成员变量接收账户对象
    private Account acc;

    public SaveThread(Account acc, String name) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            acc.saveMoney(10000);
        }
    }
}
