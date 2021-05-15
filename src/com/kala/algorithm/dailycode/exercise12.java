package com.kala.algorithm.dailycode;

/**
 * 12. 整数转罗马数字
 */

public class exercise12 {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();

        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strs = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int i = 0;

        while (i < nums.length) {
            int count = num / nums[i];
            if ( count > 0) {
                for (int j = 0; j < count; j++) {
                    sb.append(strs[i]);
                }
                num = num % nums[i];
            }
            i++;
        }
        return sb.toString();
    }
}
