package com.kala.algorithm.random;

/**
 * 198. 打家劫舍
 */

public class exercise198 {
    public int rob(int[] nums) {
        int n = nums.length;
        int first = nums[0];
        if (n == 1) {
            return first;
        }
        int second = Math.max(nums[1], first);
        for (int i = 2; i < n; i++) {
            int temp = second;
            second = Math.max(first+nums[i],second);
            first = temp;
        }
        return second;
    }
}
