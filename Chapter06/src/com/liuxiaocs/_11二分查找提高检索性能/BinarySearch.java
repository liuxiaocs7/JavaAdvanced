package com.liuxiaocs._11二分查找提高检索性能;

import java.util.Arrays;

/**
 * 目标：二分查找。
 *
 * 正常查找：从第一个元素开始遍历，一个一个的往后找，综合查找比较耗时。
 * 二分查找：二分查找的前提：对数组是有要求的，数组必须已经排好序。
 *      每次先与中间的元素进行比较，如果大于往右边找，如果小于往左边找，如果等于就返回该元素的索引位置
 *      如果没有该元素，返回-1。综合性能比较好
 */
public class BinarySearch {
    public static void main(String[] args) {
        // 1.数组
        int[] arr = {10, 14, 21, 38, 45, 47, 53, 81, 87, 99};
        // 2.需求是从数组中二分查询某个元素值的索引（提高性能）
        System.out.println("81的索引是：" + binarySearch(arr, 81));
        System.out.println("23的索引是：" + binarySearch(arr, 23));
        // Java提供的二分查找API
        System.out.println("81的索引是：" + Arrays.binarySearch(arr, 81));
        System.out.println("23的索引是：" + Arrays.binarySearch(arr, 23));
    }


    /**
     * 自己写的二分查找
     */
    private static int binarySearch(int[] arr, int num) {
        int l = 0, r = arr.length - 1;
        while(l < r) {
            int mid = l + (r - l) / 2;
            if(arr[mid] >= num) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return arr[r] == num ? r : -1;
    }
}
