package com.exercise;

public class exercise28 {
    public int strStr(String haystack, String needle) {
        int n = haystack.length(), L = needle.length();
        if (L==0) return 0;
        int pn = 0;
        while (pn < n - L + 1) {
            while (pn < n - L + 1 && haystack.charAt(pn) != needle.charAt(0)) pn++;
            int pL = 0, currLen = 0;
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
