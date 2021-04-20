package com.kala.exercise1to50;

public class exercise9 {
    public static boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        int y = 0;
        int newx = x;
        while (newx != 0) {
            int temp = newx % 10;
            newx /= 10;
            y = y * 10 + temp;
        }
        if (y == x) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
