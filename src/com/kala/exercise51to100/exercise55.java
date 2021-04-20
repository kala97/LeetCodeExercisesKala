package com.kala.exercise51to100;

public class exercise55 {
    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (i <= max) {
                max = Math.max(max, i + nums[i]);
                if (max>=n-1) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2,3,1,1,4}));
    }
}
