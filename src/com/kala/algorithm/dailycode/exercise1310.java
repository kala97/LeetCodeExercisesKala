package com.kala.algorithm.dailycode;

/**
 * 1310. 子数组异或查询
 */
public class exercise1310 {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int length = queries.length;
        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            int ans = arr[start];
            for (int j = start + 1; j <= end; j++) {
                ans ^= arr[j];
            }
            res[i] = ans;
        }
        return res;
    }

    public int[] advancexorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int length = queries.length;
        int[] xors = new int[n + 1];
        for (int i = 0; i < n; i++) {
            xors[i + 1] = xors[i] ^ arr[i];
        }
        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
            res[i] = xors[queries[i][0]] ^ xors[queries[i][1]+1];
        }
        return res;
    }
}
