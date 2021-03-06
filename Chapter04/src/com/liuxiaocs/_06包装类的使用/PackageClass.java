package com.liuxiaocs._06包装类的使用;

/**
 * 目标：包装类
 *
 * 引入：
 *      Java认为一切皆对象，引用数据类型Student都是对象了。
 *      但是在Java中8种基本数据类型不是对象，只是一种数据的类型表示。这8种数据类型显得很突兀。
 *      Java为了一切皆对象的思想统一，把8种基本数据类型转换成对应的类，这个类成为基本数据类型的包装类。
 *
 *      基本数据类型          包装类(引用数据类型)
 *      byte                Byte
 *      short               Short
 *      int                 Integer
 *      long                Long
 *
 *      float               Float
 *      double              Double
 *      char                Character
 *      boolean             Boolean
 *
 * 自动装箱：可以直接把基本数据类型的值或者变量赋值给包装类
 * 自动拆箱：可以把包装类的变量直接赋值给基本数据类型
 */
public class PackageClass {
    public static void main(String[] args) {
        int a = 12;
        Integer a1 = 12;  // 自动装箱
        Integer a2 = a;  // 自动装箱

        double b = 99.9;
        Double b1 = 99.9;  // 自动装箱
        Double b2 = b;  // 自动装箱

        Integer c = 100;
        System.out.println(c + 1);
        int c1 = c;  // 自动拆箱

        int d = 12;
        int d3 = 0;
        Integer d1 = null;  // 引用数据类型的默认值可以为null
        Integer d2 = 0;  // 引用数据类型的默认值可以为null

        System.out.println("==================");
        Integer it = Integer.valueOf(12);  // 手工装箱
        Integer it1 = new Integer(12);  // 手工装箱
        Integer it2 = 12;

        Integer it3 = 111;
        int it33 = it3;
    }
}
