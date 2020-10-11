package com.exercise;

public class exercise14 {
    public String longestCommonPrefix(String[] strs) {
        int length = strs[0].length();
        boolean ans = true;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < strs.length; i++) {
            length = Math.min(length, strs[i].length());
        }
        for (int j = 1; j < length; j++) {
            for (int i = 1; i < strs.length; i++) {
                boolean b = strs[0].regionMatches(0, strs[i], 0, j);
                ans = ans&&b;
            }
            while (ans){
                sb.append(strs[0].charAt(j));
            }
        }
        int sblength = sb.length();
        sb.append(sblength);
        return sb.toString();
    }
}
