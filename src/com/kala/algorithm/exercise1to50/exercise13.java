package com.kala.algorithm.exercise1to50;

import java.util.HashMap;
import java.util.Map;

public class exercise13 {
    public static int romanToInt(String s) {
        int ans = 0;
        int temp = 0;
        Map<Character, Integer> table = new HashMap<Character, Integer>() {{
            put('M', 1000);
            put('D', 500);
            put('C', 100);
            put('L', 50);
            put('X', 10);
            put('V', 5);
            put('I', 1);
        }};
        for (int i = 0; i < s.length(); i++) {
            if (table.get(s.charAt(i)) > temp) {
                temp = table.get(s.charAt(i)) - 2*temp;
            } else {
                temp = table.get(s.charAt(i));
            }
            ans = ans + temp;
        }
        return ans;
    }
}
