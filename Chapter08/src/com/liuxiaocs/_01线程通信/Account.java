package com.liuxiaocs._01线程通信;

public class Account {
    private String cardId;
    private double money;

    // 小明，小红两个人
    public synchronized void drawMoney(double money) {
        try {
            // 谁来取钱
            String name = Thread.currentThread().getName();
            // 1.判断余额是否足够
            if (this.money >= money) {
                // 2.开始吐钱
                this.money -= money;
                System.out.println(name + "来取钱，取钱：" + money + "，剩余：" + this.money);
                // 3.取钱后没钱了,等待自己唤醒别人
                this.notifyAll();
                this.wait();
            } else {
                // 4.余额不足
                this.notifyAll();
                this.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // 3个人
    public synchronized void saveMoney(double money) {
        try {
            // 谁来存钱
            String name = Thread.currentThread().getName();
            // 1.判断余额是否足够
            if (this.money > 0) {
                // 2.有钱了，唤醒别人，等待自己
                this.notifyAll();
                this.wait();
            } else {
                this.money += money;
                System.out.println(name + "来存钱" + money);
                // 3.唤醒别人，等待自己
                this.notifyAll();
                this.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
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
                "cardId='" + cardId + '\'' +
                ", money=" + money +
                '}';
    }
}
