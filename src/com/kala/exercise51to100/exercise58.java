package com.kala.exercise51to100;

public class exercise58 {
    public static int lengthOfLastWord(String s) {
        int n = s.length(), length = 0;
        int end = n - 1, start = 0;
        while (end >= 0 && s.charAt(end) == ' ') end--;
        if (end < 0) return 0;
        start = end;
        while (start >= 0 && s.charAt(start) != ' ') start--;
        return end-start;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(new String("Hello World")));
    }
}
