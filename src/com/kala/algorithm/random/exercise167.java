package com.kala.algorithm.random;

/**
 * 167. 两数之和 II - 输入有序数组
 */

public class exercise167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int low = i+1, high = numbers.length-1;
            while (low<high){
                int mid = (low+high)/2;
                if (target-numbers[i] == numbers[mid]){
                    ans[0] = i+1;
                    ans[1] = mid;
                }
                if (target-numbers[i]>numbers[mid]){
                    low = mid+1;
                }else {
                    high = mid-1;
                }
            }
        }
        return ans;
    }
}

