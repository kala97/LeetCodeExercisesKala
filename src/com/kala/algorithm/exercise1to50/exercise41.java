package com.kala.algorithm.exercise1to50;

public class exercise41 {
    public static int firstMissingPositive(int[] nums) {
        boolean first = false;
        int firstnum = nums.length + 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                first = true;
            }
            if (nums[i] <= 0 || nums[i] > nums.length) {
                nums[i] = 1;
            }
        }
        if (first == false) {
            return 1;
        }
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            nums[index] = -Math.abs(nums[index]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                firstnum = i + 1;
                break;
            }
        }
        return firstnum;
    }

    public static void main(String[] args) {
        firstMissingPositive(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,23,20});
    }
}
