package com.leecode.demo.sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author kevin
 */
public class GoodNum1512 {

    /**
     * 给你一个整数数组 nums 。
     *
     * 如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 。
     *
     * 返回好数对的数目。
     *
     * */

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int num = numIdenticalPairs(nums);
        System.out.println(num);
    }

    public static int numIdenticalPairs(int[] nums) {
        int flag = 0;
        for (int i = 0; i <nums.length ; i++) {
            for (int j =i+1 ; j <nums.length ; j++) {
                if (nums[i] == nums[j]){
                    flag = flag+1;
                }
            }
        }
        return flag;
    }
}
