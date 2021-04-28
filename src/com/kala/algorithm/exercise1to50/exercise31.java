package com.kala.algorithm.exercise1to50;

public class exercise31 {
    public void nextPermutation(int[] nums) {
        int index = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                index = i - 1;
                break;
            }
        }
        if (index == -1) {
            reverse(nums, 0);
        } else {
            int val = nums[index + 1];
            int loc = index + 1;
            for (int i = index + 2; i < nums.length; i++) {
                if (nums[i] > nums[index]) {
                    val = Math.min(val, nums[i]);
                    if (val == nums[i]) {
                        loc = i;
                    }
                }
            }
            swap(nums, index, loc);
            reverse(nums, index + 1);
        }
    }

    public void swap(int[] nums, int a, int b) {
        int temp;
        temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
