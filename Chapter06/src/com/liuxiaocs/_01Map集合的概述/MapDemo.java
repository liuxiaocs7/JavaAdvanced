package com.liuxiaocs._01Map集合的概述;


import java.util.HashMap;
import java.util.Map;

/**
 * 目标：Map集合概述。
 *
 * Map集合是另一个集合体系。
 * Collection是单值集合体系。
 *
 * Map集合是一种双列集合，每个元素包含两个值。
 * Map集合的每个元素的格式：key=value(键值对元素)。
 * Map集合也被称为键值对集合
 *
 * Map集合的完整格式：{key1=value1, key2=value2, key3=value3, ...}
 *
 * Map集合有啥用？
 *      1.Map集合存储的信息更加的具体丰富。
 *          Collection: ["老师", "日本", "女", "动作演员", 23, "广州"]
 *          Map: {name: "老师", jiaxiang="日本", sex="女", age=23, addr="广州"}
 *      2.Map集合很适合做购物车这样的系统。
 *          Map: {娃娃=30, huawei=1000, iphonex=1}
 *
 * 注意：集合和泛型都只能支持引用数据类型，集合完全可以称为是对象容器，存储都是对象。
 *
 * Map集合的体系：
 *                  Map<K, V>(接口，Map集合的祖宗类)
 *              /                                 \
 *           TreeMap                            HashMap<K, V>(实现类，经典的，用的最多)
 *                                                  \
 *                                                  LinkedHashMap<K, V>(实现类)
 * Map集合的特点：
 *      1.Map集合的特点是由键决定的。
 *      2.Map集合的键是无序，不重复，无索引的。
 *          Map集合后面重复的键对应的元素会覆盖前面的整个元素。
 *      3.Map集合的值无要求
 *      4.Map集合的键值对都可以为null。
 *
 * HashMap: 元素按照键是无序，不重复，无索引，值不做要求。
 * LinkedHashMap: 元素按照键是有序，不重复，无索引，值不做要求。
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("娃娃", 1);
        maps.put("huawei", 10);
        maps.put("iphoneXS", 2);
        maps.put(null, null);
        maps.put("娃娃", 30);
        maps.put("特仑苏", 2);
        // {null=null, 特仑苏=2, huawei=10, 娃娃=30, iphoneXS=2}
        System.out.println(maps);
    }
}
