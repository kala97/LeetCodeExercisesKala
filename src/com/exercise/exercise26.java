package com.exercise;

import java.util.Arrays;

public class exercise26 {
    public int removeDuplicates(int[] nums) {
        int length = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                nums[i-1]= 999999;
            }else {
                length++;
            }
        }
        Arrays.sort(nums);
        return length;
    }
}
