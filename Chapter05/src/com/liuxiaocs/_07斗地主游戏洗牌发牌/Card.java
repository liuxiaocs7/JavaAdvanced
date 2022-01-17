package com.liuxiaocs._07斗地主游戏洗牌发牌;

// 牌类
public class Card {
    private String number;
    private String color;
    // 存储牌在新牌中的索引
    private int index;

    public Card() {
    }

    public Card(String number, String color, int index) {
        this.number = number;
        this.color = color;
        this.index = index;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return number + color;
    }
}
