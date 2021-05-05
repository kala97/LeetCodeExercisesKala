package com.kala.algorithm.dailycode;

/**
 * 740. 删除并获得点数
 */

public class exercise740 {
    public int deleteAndEarn(int[] nums) {
        int maxval = 0;
        for (int num : nums) {
            maxval = Math.max(maxval, num);
        }
        int sum[] = new int[maxval+1];
        for (int num : nums) {
            sum[num] += num;
        }

        return rob(sum);
    }

    private int rob(int[] sum) {
        int first = sum[0];
        int second = Math.max(first, sum[1]);
        for (int i = 2; i < sum.length; i++) {
            int temp = second;
            second = Math.max(first + sum[i], second);
            first = temp;
        }
        return second;
    }
}
