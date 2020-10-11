package com.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exercise15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List list = new ArrayList();
        Arrays.sort(nums);
        int right = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                while (j<right&&nums[j]+nums[right] > -nums[i]){
                    right--;
                }
                if (j==right){
                    break;
                }
                if (nums[i] + nums[j] + nums[right] == 0) {
                    list.add(new int[]{nums[i], nums[j], nums[right]});

                }
            }
        }
        return list;
    }
}
