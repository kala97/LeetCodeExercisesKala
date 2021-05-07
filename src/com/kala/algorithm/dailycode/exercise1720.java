package com.kala.algorithm.dailycode;

/**
 * 1720. 解码异或后的数组
 */

public class exercise1720 {
    public int[] decode(int[] encoded, int first) {
        int[] num = new int[encoded.length + 1];
        num[0] = first;
        for (int i = 1; i < num.length; i++) {
            num[i] = num[i - 1] ^ encoded[i - 1];
        }
        return num;
    }
}
