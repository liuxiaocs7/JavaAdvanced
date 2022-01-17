package com.liuxiaocs._03List系列集合的使用;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标：ArrayList集合。
 *
 * Collection集合的体系：
 *                             Collection<E>接口
 *              /                                         \
 *          Set<E>(接口)                              List<E>(接口)
 *             /            \                       /                     \                \
 *     HashSet<E>(实现类)  TreeSet<E>(实现类)     ArrayList<E>(实现类)  Vector(线程安全) LinkedList<E>(实现类)
 *      /
 *  LinkedHashSet<E>(实现类)
 *
 *  Collection集合的特点：
 *       Set系列集合：添加的元素是无序，不重复，无索引的。
 *          -- HashSet: 添加的元素是无序，不重复，无索引的。
 *          -- LinkedHashSet: 添加的元素是有序，不重复，无索引的。
 *          -- TreeSet: 不重复，无索引，按照大小默认升序排序！！
 *       List系列集合：添加的元素是有序，可重复，有索引。
 *          -- ArrayList: 添加的元素是有序，可重复，有索引的。
 *          -- LinkedList: 添加的元素是有序，可重复，有索引的。
 *          -- Vector: 是线程安全的，速度慢，工作中很少使用。
 *
 *  List集合继承了Collection集合的全部功能，同时因为List系列集合有索引。
 *  ArrayList集合底层基于数组存储数据的，查询块，增删慢！
 *  因为List集合多了索引，所以多了很多按照索引操作元素的功能：
 *      - public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上。
 *      - public E get(int index): 返回集合中指定位置的元素。
 *      - public E remove(int index): 移除列表中指定位置的元素，返回的是被移除的元素。
 *      - public E set(int index, E element): 用指定元素替换集合中指定位置的元素，返回值的更新
 *
 */
public class ListDemo01 {
    public static void main(String[] args) {
        // 1.创建一个ArrayList集合对象：这是一行经典代码！
        List<String> lists = new ArrayList<>();
        lists.add("java1");
        lists.add("java1");
        lists.add("java2");
        lists.add("java2");
        System.out.println(lists);

        // 2.在某个索引位置插入元素
        lists.add(2, "MySQL");
        System.out.println(lists);

        // 3.根据索引删除元素，返回被删除元素
        System.out.println(lists.remove(2));
        System.out.println(lists);

        // 4.根据索引获取元素
        System.out.println(lists.get(2));

        // 5.修改索引位置处的元素
        System.out.println(lists.set(2, "MyBatis"));  // 返回旧值java2
        System.out.println(lists);
    }
}
