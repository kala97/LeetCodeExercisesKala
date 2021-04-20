package com.kala.exercise1to50;

public class exercise35 {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int index = n;
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = l + ((r - l) >> 1);
            if (target <= nums[mid]) {
                r = mid-1;
                index = mid;
            }else {
                l = mid+1;
            }
        }
        return index;
    }
}
