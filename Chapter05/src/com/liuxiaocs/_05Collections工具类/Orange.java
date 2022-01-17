package com.liuxiaocs._05Collections工具类;

public class Orange implements Comparable<Orange> {
    private String name;
    private double weight;
    private String price;

    @Override
    public int compareTo(Orange o) {
        // 集合会自动送入两个橘子对象来比较
        // 认为 o1 > o2 返回正整数
        // 认为 o1 = o2 返回0
        // 认为 o1 < o2 返回负整数
        if(this.weight > o.weight) return 1;
        if(this.weight < o.weight) return -1;
        return 0;
        // 或者简写：
        // return Double.compare(this.weight, o.weight);
    }

    public Orange() {
    }

    public Orange(String name, double weight, String price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price='" + price + '\'' +
                '}';
    }
}
