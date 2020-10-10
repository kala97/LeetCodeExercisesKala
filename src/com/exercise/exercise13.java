package com.exercise;

import java.util.HashMap;
import java.util.Map;

public class exercise13 {
    public int romanToInt(String s) {
        Map<Character,Integer> table = new HashMap<>(){{
            put('M',1000);
            put('D',500);
            put('C',100);
            put('L',50);
            put('X',10);
            put('V',5);
            put('I',1);
        }};

    }
}
