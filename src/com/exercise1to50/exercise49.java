package com.exercise1to50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class exercise49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List> ans = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String s = String.valueOf(chars);
            if (!ans.containsKey(s)) ans.put(s,new ArrayList());
            ans.get(s).add(str);
        }
        return new ArrayList(ans.values());
    }

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}
