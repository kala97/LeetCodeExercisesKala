package com.kala.algorithm.random;

/**
 * 925. 长按键入
 */
public class exercise925 {
    public boolean isLongPressedName(String name, String typed) {
        int m = 0, n = 0;
        while (n < typed.length()) {
            if (m < name.length() && name.charAt(m) == typed.charAt(n)) {
                m++;
                n++;
            } else if (n > 0 && typed.charAt(n) == typed.charAt(n-1)){
                n++;
            }else {
                return false;
            }
        }
        return m == name.length();
    }
}
