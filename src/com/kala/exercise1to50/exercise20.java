package com.kala.exercise1to50;

import java.util.*;

public class exercise20 {
    public boolean isValid(String s) {
        int length = s.length();
        if (length % 2 == 1) {
            return false;
        }
        Map<Character, Character> symbolmap = new HashMap<>();
        symbolmap.put(')','(');
        symbolmap.put(']','[');
        symbolmap.put('}','{');
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < length; i++) {
            if (symbolmap.containsKey(s.charAt(i))) {
                if (stack.isEmpty() || stack.peek() != symbolmap.get(s.charAt(i))) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}