package com.leecode.demo.sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author kevin
 */
public class DynamicSum1480 {


    /**
     * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
     *
     * 请返回 nums 的动态和。
     *
     * */

    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        int[] result = runningSumPlus(nums);
        Arrays.stream(result).forEach(System.out::println);
    }

    public static int[] runningSumPlus(int[] nums) {
        for (int i = 1; i <nums.length ; i++) {
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }

    public static int[] runningSum(int[] nums) {
        int num = 0;
        int [] result = new int[nums.length];
        Map<Integer,Integer> maps = new HashMap<>(16);
        for (int i = 0; i < nums.length; i++) {
            if (i==0){
                num = nums[i];
            }else{
                num = nums[i]+maps.get(i-1);
            }
            maps.put(i,num);
            result[i] = num;
        }
        return result;
    }
}
