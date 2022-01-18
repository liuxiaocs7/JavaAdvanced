package com.liuxiaocs._20线程同步_Lock锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// 账户类
public class Account {
    private String cardID;
    private double money;

    // 创建一把锁对象: 因为账户对象对于小明小红树唯一的，所以这里的锁对象对于小明小红也是唯一的
    private final Lock lock = new ReentrantLock();

    public Account() {
    }

    public Account(String cardID, double money) {
        this.cardID = cardID;
        this.money = money;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "cardID='" + cardID + '\'' +
                ", money=" + money +
                '}';
    }

    // 小明线程，小红线程
    public void drawMoney(double money) {
        // 开始判断取钱逻辑
        // 1.先知道是谁来取钱
        String name = Thread.currentThread().getName();
        // 2.判断余额是否足够
        try {
            lock.lock();  // 上锁
            if (this.money >= money) {
                System.out.println(name + "来取钱，余额足够，吐出" + money);
                // 3.更新余额
                this.money -= money;
                System.out.println(name + "来取钱后，余额剩余" + this.money);
            } else {
                System.out.println(name + "来取钱，余额不足！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();  // 解锁
        }
    }
}
