package com.exercise;

import java.util.ArrayList;
import java.util.List;

public class exercise22 {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrack(list,new StringBuilder(),0,0,n);
        return list;
    }

    public void backtrack(List<String> list, StringBuilder sb, int open, int close, int max) {
        if (sb.length() == 2 * max) {
            list.add(sb.toString());
        }
        if (open<max){
            sb.append('(');
            backtrack(list, sb, open+1, close, max);
            sb.deleteCharAt(sb.length()-1);
        }
        if (close<open){
            sb.append(')');
            backtrack(list, sb, open, close+1, max);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
