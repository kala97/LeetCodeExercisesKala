package com.kala.algorithm.random;

import java.util.HashSet;
import java.util.Set;

/**
 * 128. 最长连续序列
 */

public class exercise128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> nums_set = new HashSet<>();
        for (int num : nums) {
            nums_set.add(num);
        }
        int longest = 0;
        for (Integer num : nums_set) {
            if (!nums_set.contains(num - 1)) {
                int current = 1;
                num += 1;

                while (nums_set.contains(num)) {
                    current+=1;
                    num += 1;
                }
                longest = Math.max(longest,current);
            }
        }
        return longest;
    }
}
