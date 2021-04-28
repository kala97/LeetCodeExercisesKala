package com.kala.algorithm.exercise1to50;

public class exercise12 {
    public String intToRoman(int num) {
        int[] value = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < value.length && num > 0; i++) {
            while (value[i]<=num){
                num-=value[i];
                sb.append(roman[i]);
            }
        }
        return sb.toString();
    }
}
