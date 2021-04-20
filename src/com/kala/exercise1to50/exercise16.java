package com.kala.exercise1to50;

import java.util.ArrayList;
import java.util.List;

public class exercise16 {
    public int threeSumClosest(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        int best = 10000000;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int ans = nums[i] + nums[j] + nums[k] - target;
                    if (Math.abs(ans)<Math.abs(best)){
                        best = ans;
                    }
                }
            }
        }
        return best+target;
    }
}
