package com.kala.dailycode;

import java.util.Arrays;

/**
 * @Description 1011. 在 D 天内送达包裹的能力
 * @Version 1.0
 **/
public class exercise1011 {
    public int shipWithinDays(int[] weights, int D) {
        int left = Arrays.stream(weights).max().getAsInt();
        int right = Arrays.stream(weights).sum();
        while (left < right) {
            int mid = (left + right) / 2;
            int need = 1;
            int cur = 0;
            for (int weight : weights) {
                if (cur + weight > mid) {
                    need++;
                    cur = 0;
                }
                cur += weight;
            }
            if (need <= D) {
                right = mid;
            }else {
                left = mid+1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        exercise1011 exercise1011 = new exercise1011();
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int D = 5;
        int i = exercise1011.shipWithinDays(weights, D);
        System.out.println(i);
    }
}
