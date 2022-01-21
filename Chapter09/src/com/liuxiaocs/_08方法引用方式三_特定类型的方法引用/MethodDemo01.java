package com.liuxiaocs._08方法引用方式三_特定类型的方法引用;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 目标：方法引用有四种形式：
 *      1.静态方法的引用。
 *      2.实例方法的引用。
 *      3.特定类型方法的引用。
 *      4.构造器引用
 *
 *      3.特定类型方法的引用。
 *           特定类型：String ,任何类型。
 *           格式：特定类型::方法。
 *      注意：
 *          如果第一个参数列表中的形参中的第一个参数作为了后面的方法的调用者，
 *          并且其余参数作为后面方法的形参，那么就可以用特定类型方法引用了。
 *
 *          第一个参数作为主调，后面的参数作为形参
 */
public class MethodDemo01 {
    public static void main(String[] args) {
        String[] strs = new String[]{"James", "AA", "John",
                "Patricia","Dlei" , "Robert","Boom", "Cao" ,"black" ,
                "Michael", "Linda","cao","after","sBBB"};

        // public static <T> void sort(T[] a, Comparator<? super T> c)
        // 需求：按照元素的首字符(忽略大小写)升序排序！！！
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));

        // 忽略大小写比较
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 按照元素的首字符(忽略大小写)比较。
                return o1.compareToIgnoreCase(o2);
            }
        });
        System.out.println(Arrays.toString(strs));

        // Lambda比较
        // o1是主调，o2是形参
        Arrays.sort(strs, (o1, o2) -> o1.compareToIgnoreCase(o2));
        System.out.println(Arrays.toString(strs));

        // 特定类型的方法引用
        Arrays.sort(strs, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(strs));
    }
}