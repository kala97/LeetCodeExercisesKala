package com.kala.algorithm.exercise51to100;

import java.util.Arrays;

public class exercise60 {
    public String getPermutation(int n, int k) {
        int[] factoria = new int[n];
        factoria[0] = 1;
        for (int i = 1; i < n; i++) {
            factoria[i] = factoria[i - 1] * i;
        }
        StringBuffer sb = new StringBuffer();
        int[] index = new int[n + 1];
        Arrays.fill(index, 1);
        k--;
        for (int i = 1; i <= n; i++) {
            int order = k / factoria[n - i] + 1;
            for (int j = 1; j <= n; j++) {
                order -= index[j];
                if (order == 0) {
                    sb.append(j);
                    index[j] = 0;
                    break;
                }
            }
            k = k % factoria[n - i];
        }
        return sb.toString();
    }
}
