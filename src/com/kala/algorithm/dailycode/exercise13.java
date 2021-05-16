package com.kala.algorithm.dailycode;

import java.util.HashMap;
import java.util.Map;

/**
 * 13. 罗马数字转整数
 */

public class exercise13 {
    public int romanToInt(String s) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);

        int n = s.length();

        int ans = 0;

        for (int i = 0; i < n; i++) {
            Integer integer = map.get(s.charAt(i));
            if (i < n - 1 && integer < map.get(s.charAt(i + 1))) {
                ans -= integer;
            } else {
                ans += integer;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        exercise13 exercise13 = new exercise13();
        exercise13.romanToInt("VI");
    }
}
