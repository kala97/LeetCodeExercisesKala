package com.kala.algorithm.exercise51to100;

/**
 * @Description LeetCode91
 * @Version 1.0
 **/
public class exercise91 {

    public int numDecodings(String s) {
        int n = s.length();
        int[] f = new int[n+1];
        f[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (s.charAt(i - 1) != '0') {
                f[i] += f[i - 1];
            }
            if (i > 1 && s.charAt(i - 2) != '0' && (s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1)-'0') <= 26) {
                f[i] += f[i - 2];
            }
        }

        return f[n];
    }

    public static void main(String[] args) {
        exercise91 exercise91 = new exercise91();
        int i = exercise91.numDecodings("12");
        System.out.println(i);;
    }

}
