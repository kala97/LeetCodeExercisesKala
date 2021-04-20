package com.kala.exercise1to50;

public class exercise43 {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        int m = num1.length(), n = num2.length();
        int[] arr = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            int x = num1.charAt(i) - '0';
            for (int i1 = n - 1; i1 >= 0; i1--) {
                int y = num2.charAt(i1) - '0';
                arr[i + i1 + 1] += x * y;
            }
        }
        for (int i = m + n - 1; i > 0; i--) {
            arr[i - 1] += arr[i] / 10;
            arr[i] %= 10;
        }
        StringBuilder sb = new StringBuilder();
        int index = arr[0] == 0 ? 1 : 0;
        while (index<m+n){
            sb.append(arr[index]);
            index++;
        }
        return sb.toString();
    }
}
