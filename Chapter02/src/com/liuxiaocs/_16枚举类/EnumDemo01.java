package com.liuxiaocs._16枚举类;

/**
 * 目标：枚举类的概述。(面向对象的特殊类型)
 *
 * 枚举类的作用
 *      枚举类是用于做信息标志和信息分类
 * 枚举类的格式：
 *      修饰符 enum 枚举名称 {
 *          实例1名称， 实例2名称...;
 *      }
 *      -- 枚举类第一行罗列的必须是枚举类的对象名称
 * 反编译后的枚举源代码：
 *      Compiled from "Sex.java"
 *      public final class Sex extends java.lang.Enum<Sex> {
 *          public static final Sex BOY = new Sex();
 *          public static final Sex GIRL = new Sex();
 *
 *          public static Sex[] values();
 *          public static Sex ValueOf(java.lang.String);
 *          static {};
 *      }
 * 枚举类的特点：
 *      1. 枚举类是final修饰的，不能被继承
 *      2. 枚举类默认继承了枚举类型：java.lang.Enum
 *      3. 枚举类的第一行罗列的是枚举类的对象，而且是用常量存储的。
 *      4. 所以枚举类的第一行写的都是常量名称，默认存储了枚举对象。
 *      5. 枚举类的构造器默认是私有的。
 *      6. 枚举类相当于是多例对象。
 * 小结：
 *      记住枚举的格式和特点
 */
public class EnumDemo01 {
    public static void main(String[] args) {
        Sex s1 = Sex.BOY;
        System.out.println(s1);
        System.out.println(s1.ordinal());  // 枚举对象的索引位置 0
        Sex s2 = Sex.GIRL;
        System.out.println(s2);
        System.out.println(s2.ordinal());  // 枚举对象的索引位置 1
    }
}

// javac Sex.java 编译
// javap Sex.class 反编译
// 枚举类的格式；
enum Sex {
    BOY, GIRL;
}
