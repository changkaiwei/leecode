package com.leecode.demo.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kevin
 * 常见排序算法
 */
public class SortDemo {

    public static void main(String[] args) {
        int[] nums = {15,8,17,1,5,73,9};
        popSort(nums);

    }

    /**
     * 冒泡排序 O(N^2)
     * */
    public  static  void popSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            //第一个元素 交换 7（arr.length） - 1（i）次
            //第二个元素 交换 7（arr.length） - 2（i）次
            //第三个元素 交换 7（arr.length） - 3（i）次
            //...
            //第六个元素 交换 7（arr.length） - 6（i）次
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
