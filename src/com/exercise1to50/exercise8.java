package com.exercise1to50;

import java.util.HashMap;
import java.util.Map;

public class exercise8 {
    public int myAtoi(String s) {
        Automation automation = new Automation();

        for (int i = 0; i < s.length(); i++) {
            automation.get(s.charAt(i));
        }
        return (int) (automation.ans* automation.sign);
    }
}

class Automation {
    public long ans = 0;
    public int sign = 1;
    private String state = "start";
    private Map<String, String[]> table = new HashMap<>() {
        {
            put("start", new String[]{"start", "signed", "in_number", "end"});
            put("signed", new String[]{"end", "end", "in_number", "end"});
            put("in_number", new String[]{"end", "end", "in_number", "end"});
            put("end", new String[]{"end", "end", "end", "end"});
        }
    };

    public void get(char c) {
        state = table.get(state)[get_col(c)];
        if ("signed".equals(state)) {
            sign = c == '+' ? 1 : -1;
        }
        if ("in_number".equals(state)) {
            ans = ans * 10 + c - '0';
            ans = sign == 1?Math.min(ans,(long)Integer.MAX_VALUE):Math.min(ans,-(long)Integer.MIN_VALUE);
        }
    }

    public int get_col(char c) {
        if (c == ' ') {
            return 0;
        }
        if (c == '+' || c == '-') {
            return 1;
        }
        if (Character.isDigit(c)) {
            return 2;
        }
        return 3;
    }
}
