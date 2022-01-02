package com.liuxiaocs._17引用类型作为成员变量的类型;

/**
 * 目标：引用类型作为成员变量类型(复合类型)
 */
public class TestDemo {
    public static void main(String[] args) {
        Student zcq = new Student();
        zcq.setName("郑从庆");
        zcq.setAge(19);
        Address addr = new Address("110", "天河区吉山区", 98, 99);
        zcq.setAddress(addr);

        Address addr1 = zcq.getAddress();
        System.out.println(addr1.getCode() + "-->" + addr1.getName());
        System.out.println(zcq.getName());
        System.out.println(zcq.getAge());
    }
}
