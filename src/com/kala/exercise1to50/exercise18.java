package com.kala.exercise1to50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exercise18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int length = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {
                break;
            }
            if (nums[i] + nums[length - 3] + nums[length - 2] + nums[length - 1] < target) {
                continue;
            }
            for (int j = i + 1; j < length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                if (nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) {
                    break;
                }
                if (nums[i] + nums[j] + nums[length - 2] + nums[length - 1] < target) {
                    continue;
                }
                int left = j + 1;
                int right = length - 1;
                while (left<right){
                    int sum = nums[i]+nums[j]+nums[left]+nums[right];
                    if (sum == target){
                        list.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        while (left<right&&nums[left]==nums[left+1]){
                            left++;
                        }
                        left++;
                        while (left<right&&nums[right]==nums[right-1]){
                            right--;
                        }
                        right--;
                    }
                    else if (sum<target){
                        left++;
                    }else {
                        right--;
                    }
                }
            }
        }
        return list;
    }
}
