package com.kala.algorithm.dailycode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 137. 只出现一次的数字 II
 */

public class exercise137 {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                Integer count = map.get(num);
                count++;
                if (count != 3) {
                    map.put(num, count);
                }else {
                    map.remove(num);
                }
            } else {
                map.put(num, 1);
            }
        }
        int target = 0;
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            target = key;
        }
        return target;
    }
}
