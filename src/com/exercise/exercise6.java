package com.exercise;

public class exercise6 {
    public String convert(String s, int numRows) {
        StringBuilder newString = new StringBuilder();
        int interval = 2 * numRows - 2;
//        int slong = s.length() / interval + 1;
        if (numRows == 1) {
            return s;
        }
        for (int i = 1; i <= numRows; i++) {
            if (i == 1) {
                for (int j = 0; j < s.length(); j += interval) {
                    newString.append(s.charAt(j));
                }
            } else if (i == numRows) {
                for (int j = i - 1; j < s.length(); j += interval) {
                    newString.append(s.charAt(j));
                }
            } else {
                int distance;
                distance = numRows - i;
                for (int j = i - 1; j < s.length(); j += interval) {
                    newString.append(s.charAt(j));
                    int k = j + 2 * distance;
                    if (k < s.length()) {
                        newString.append(s.charAt(k));
                    }
                }
            }
        }
        return newString.toString();
    }
}
