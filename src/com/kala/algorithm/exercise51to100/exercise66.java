package com.kala.algorithm.exercise51to100;

import java.util.Arrays;

public class exercise66 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if (digits[n - 1] == 9) {
            for (int i = n - 1; i >= 0; i--) {
                if (digits[i] != 9) {
                    digits[i]+=1;
                    break;
                }
                if (digits[i]==9&&i==0){
                    int[] ans =new int[n+1];
                    Arrays.fill(ans,0);
                    ans[0] = 1;
                    return ans;
                }
                digits[i]=0;
            }
        } else {
            digits[n - 1] += 1;
        }
        return digits;
    }
}
