package com.liuxiaocs._07Map集合练习;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 目标：输出一个字符串中每个字符出现的次数。（经典面试题）

 分析：
    （1）键盘录入一个字符串。aabbccddaa123。
    （2）定义一个Map集合，键是每个字符，值是其出现的次数。 {a=4 , b=2 ,...}
    （3）遍历字符串中的每一个字符。
    （4）拿着这个字符去Map集合中看是否有这个字符键，有说明之前统计过，其值+1
     没有这个字符键，说明该字符是第一次统计，直接存入“该字符=1”
 */
public class MapDemo01 {
    public static void main(String[] args) {
        System.out.print("请输入字符串: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Character character : map.keySet()) {
            System.out.println(character + "=" + map.get(character));
        }
    }
}
