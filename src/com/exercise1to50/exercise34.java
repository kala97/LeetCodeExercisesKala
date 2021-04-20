package com.exercise1to50;

public class exercise34 {
    public int[] searchRange(int[] nums, int target) {
        int[] index = {-1, -1};
        int n = nums.length;
        if (n == 1 && nums[0] == target) {
            index[0] = 0;
            index[1] = 0;
            return index;
        }
        if (n<=1) {
            return index;
        }
        int l = 0, r = n - 1;
        while (l <= r) {
            if (nums[0] == target){
                index[0] = 0;
                break;
            }
            int mid = (l + r) / 2;
            if (nums[mid] == target && nums[mid - 1] < target) {
                index[0] = mid;
            }
            if (nums[mid] >= target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        l = 0;
        r = n - 1;
        while (l <= r) {
            if (nums[n-1] == target){
                index[1] = n-1;
                break;
            }
            int mid = (l + r) / 2;
            if (nums[mid] == target && nums[mid + 1] > target) {
                index[1] = mid;
            }
            if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return index;
    }
}
