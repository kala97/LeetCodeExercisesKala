package com.kala.algorithm.dailycode;

/**
 * 633. 平方数之和
 */

public class exercise633 {
    public boolean judgeSquareSum(int c) {
        int left = 0;
        int right = (int) Math.sqrt(c);
        while (left <= right) {
            int sum = left * left + right * right;
            if (c == sum) {
                return true;
            }
            if (sum > c) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }
}
