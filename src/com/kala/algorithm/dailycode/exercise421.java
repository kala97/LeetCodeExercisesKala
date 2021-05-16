package com.kala.algorithm.dailycode;

/**
 * 421. 数组中两个数的最大异或值
 */

public class exercise421 {
    public int findMaximumXOR(int[] nums) {

        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int temp = nums[i]^nums[j];
                max = Math.max(max,temp);
            }
        }
        return max;
    }

}
