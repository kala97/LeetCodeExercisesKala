package com.kala.algorithm.exercise51to100;

public class exercise53 {
    public int maxSubArray_greedy(int[] nums) {
        int max = 0,ans = nums[0];
        for (int num : nums) {
            max = Math.max(max+num,num);
            ans = Math.max(max,ans);
        }
        return ans;
    }
}
