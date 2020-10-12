package com.leecode.demo.sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author kevin
 */
public class SumTest1 {

    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
     */
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] result = twoSumPlus(nums,22);
        Arrays.stream(result).forEach(System.out::println);
    }

    /**
     *
     */
    public static int[] twoSumPlus(int[] nums, int target) {
        int [] result = new int[2];
        Map<Integer,Integer> maps = new HashMap<>(16);
        for (int i = 0; i < nums.length; i++) {
            if (maps.containsKey(nums[i])){
                result[1] = i ;
                result[0] = maps.get(nums[i]);
                return result;
            }
            maps.put(target-nums[i],i);
        }
        return  result;
    }

    /**
     * 暴力穷举 垃圾 O (N^2)
     */
    public static int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            for (int j = i+1; j <nums.length ; j++) {
                int nextNum  = nums[j];
                if (currentNum+nextNum==target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return  result;
    }
}
