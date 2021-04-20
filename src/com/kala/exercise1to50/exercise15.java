package com.kala.exercise1to50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exercise15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List list = new ArrayList();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int target = -nums[i];
            int right = nums.length - 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                while (j < right && nums[j] + nums[right] > target) {
                    --right;
                }
                if (j == right) {
                    break;
                }
                if (nums[j] + nums[right] == target) {
                    list.add(new int[]{nums[i], nums[j], nums[right]});
                }
            }
        }
        return list;
    }
}

//[-1,0,1,2,-1,-4,-2,-3,3,0,4]
//[-4,-3,-2,-1,-1,0,0-1,2,3,4]
