package com.kala.exercise1to50;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class exercise17 {
    public List<String> letterCombinations(String digits) {
        List<String> alphabet = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        if (digits.length()==0){
            return alphabet;
        }
//        List<String[]> numstring = new ArrayList<>();
        Map<Character, String> numpad = new HashMap();
        numpad.put('2', "abc");
        numpad.put('3', "def");
        numpad.put('4', "ghi");
        numpad.put('5', "jkl");
        numpad.put('6', "mno");
        numpad.put('7', "pqrs");
        numpad.put('8', "tuv");
        numpad.put('9', "wxyz");

        backtrack(alphabet, 0, digits, sb, numpad);

        return alphabet;
    }

    private void backtrack(List<String> alphabet, int index, String digits, StringBuffer sb, Map<Character, String> numpad) {
        if (index == digits.length()) {
            alphabet.add(sb.toString());
        } else {
            char c = digits.charAt(index);
            String s = numpad.get(c);
            for (int i = 0; i < s.length(); i++) {
                sb.append(s.charAt(i));
                backtrack(alphabet, index + 1, digits, sb, numpad);
                sb.deleteCharAt(index);
            }
        }
    }
}
