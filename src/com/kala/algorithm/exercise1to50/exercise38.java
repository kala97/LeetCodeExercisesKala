package com.kala.algorithm.exercise1to50;

import java.util.HashMap;

public class exercise38 {
    public String countAndSay(int n) {
        if (n==1) return "1";
        String num = countAndSay(n-1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            int count = 1;
            while (i<num.length()-1&&num.charAt(i)==num.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(count);
            sb.append(num.charAt(i));
        }
        return sb.toString();
    }
}