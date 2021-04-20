package com.kala.exercise1to50;

public class exercise5 {
    String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int maxString = 0;
        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            int ans1 = expendAroundCenter(i, i + 1, s);
            int ans2 = expendAroundCenter(i, i, s);
            maxString = Math.max(ans1, ans2);
            if (maxString > right - left) {
                right = i + maxString / 2;
                left = i - (maxString-1) / 2;
            }
        }
        return s.substring(left, right+1);
    }

    int expendAroundCenter(int left, int right, String s) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            right++;
            left--;
        }
        return right - left - 1;
    }
}
