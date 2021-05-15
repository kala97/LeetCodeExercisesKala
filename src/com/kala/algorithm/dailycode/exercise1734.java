package com.kala.algorithm.dailycode;

/**
 * 1734. 解码异或后的排列
 */

public class exercise1734 {
    public int[] decode(int[] encoded) {
        int length = encoded.length + 1;
        int m = 1;
        for (int i = 1; i <= length; i++) {
            m ^= i;
        }
        int n = 1;
        for (int i = 1; i < length - 1; i +=2) {
            n ^= encoded[i];
        }
        int[] perm = new int[length];
        perm[0] = m ^ n;
        for (int i = 1; i < length; i++) {
            perm[i] = perm[i-1]^encoded[i-1];
        }
        return perm;
    }
}
