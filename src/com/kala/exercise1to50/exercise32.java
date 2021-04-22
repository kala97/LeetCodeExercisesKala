package com.kala.exercise1to50;

import java.util.Deque;
import java.util.LinkedList;

public class exercise32 {
    public static int longestValidParentheses(String s) {
        int ans = 0;
        Deque<Integer> stack = new LinkedList<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    ans = Math.max(ans, i - stack.peek());
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(longestValidParentheses("(()"));
    }
}