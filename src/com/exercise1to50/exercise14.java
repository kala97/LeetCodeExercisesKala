package com.exercise1to50;

public class exercise14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) {
            return "";
        }
        int length = strs[0].length();
//        for (int i = 1; i < strs.length; i++) {
//            length = Math.min(length, strs[i].length());
//        }
        for (int j = 0; j < length; j++) {
            char c = strs[0].charAt(j);
            for (int i = 1; i < strs.length; i++) {
                if (j == strs[i].length()||strs[i].charAt(j) != c ) {
                    return strs[0].substring(0, j);
                }
            }
        }
        return strs[0];
    }

//    public static void main(String[] args) {
//        System.out.println(longestCommonPrefix(new String[]{"ab", "a"}));
//    }
}
