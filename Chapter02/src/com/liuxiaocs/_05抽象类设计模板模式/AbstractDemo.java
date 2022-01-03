package com.liuxiaocs._05抽象类设计模板模式;

/**
 * 目标：抽象类设计模板模式
 *
 * 什么是设计模式？
 *      设计模式是前人或者技术大牛或者软件行业在生产实战中发现的优秀软件设计架构和思想
 *      后来者可以直接用这些架构或者思想就可以设计出优秀，提高效率，提高软件可扩展性和可维护性的软件
 *
 * 模板设计模式就是一种经典的设计模式思想。
 *
 * 模板设计模式的作用：优化代码架构，提高代码的复用性，相同功能的重复代码无需反复书写
 *      可以做到部分实现，部分抽象，抽象的东西交给使用模板的人重写实现!
 *
 * 作文模板：
 *      标题固定的：《我的爸爸》
 *      第一段固定：请介绍一下你的爸爸，说说你的爸爸有多好，说说有多牛逼
 *      正文部分：抽象出来
 *      结尾部分：我爸爸真棒，有这样的爸爸简直太爽了，下辈子还要做他儿子
 *
 * 小结：
 *      模板设计模式的作用：优化代码架构，提高代码的复用性，相同功能的重复代码无需反复书写！
 *      可以做到部分实现，部分抽象，抽象的东西交给使用模板的人重写实现！
 */
public class AbstractDemo {
    public static void main(String[] args) {
        Student lty = new Student();
        lty.write();

        Teacher t = new Teacher();
        t.write();
    }
}

class Teacher extends Template {
    @Override
    public String writeMain() {
        return "\t\t我爸爸也挺好的!";
    }
}

class Student extends Template {
    @Override
    public String writeMain() {
        return "\t\t我爸爸很帅，而且很牛逼，我都是闭着眼睛开车，所以现在还没有出来！";
    }
}

// 1.设计一个模板类
abstract class Template {
    private String title = "\t\t\t\t\t\t\t《我的爸爸》";
    private String one = "\t\t请介绍一下你的爸爸，说说你的爸爸有多好，说说有多牛逼。";
    private String last = "\t\t我爸爸真棒，有这样的爸爸简直太爽了，下辈子还要做他儿子。";

    // 2.写作文的功能
    public void write() {
        System.out.println(title);
        System.out.println(one);
        // 3.写正文部分，正文部分模板不能确定，交给使用模板的子类来写
        System.out.println(writeMain());
        System.out.println(last);
    }

    // 4.定义抽象方法
    public abstract String writeMain();
}
