package com.exercise;

import java.util.Arrays;

public class exercise27 {
    public int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > val) {
                break;
            }
            if (nums[i] == val) {
                length++;
                nums[i] = 999999;
            }
        }
        Arrays.sort(nums);
        return (nums.length - length);
    }

    public int removeElement1(int[] nums, int val) {
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=val){
                nums[length] = nums[i];
                length++;
            }
        }
        return length;
    }
}
