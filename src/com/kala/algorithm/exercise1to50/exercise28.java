package com.kala.algorithm.exercise1to50;

public class exercise28 {
    public static int strStr(String haystack, String needle) {
        int L = needle.length(), n = haystack.length();
        if (L == 0) {
            return 0;
        }
        int pn = 0;
        while (pn < n - L + 1) {
            while (pn < n - L + 1 && haystack.charAt(pn) != needle.charAt(0)) {
                pn++;
            }
            int currLen = 0, pL = 0;
            while (pL < L && pn < n && haystack.charAt(pn) == needle.charAt(pL)) {
                pL++;
                pn++;
                currLen++;
            }
            if (currLen == L) {
                return pn - L;
            }
            pn = pn - currLen + 1;
        }
        return -1;
    }
}

class KMP {
//    private int[][] dp;
//    private String pat;

    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if (m==0){
            return 0;
        }

        int[][] dp = new int[m][255];

        dp[0][needle.charAt(0)] = 1;
        int x = 0;
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < 255; j++) {
                dp[i][j] = dp[x][j];
            }
            dp[i][needle.charAt(i)] = i + 1;
            x = dp[x][needle.charAt(i)];
        }

        int j = 0;
        for (int i = 0; i < n; i++) {
            j = dp[j][haystack.charAt(i)];
            if (j == m) {
                return i - m + 1;
            }
        }
        return -1;
    }
}
