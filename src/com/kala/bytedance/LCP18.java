package com.kala.bytedance;

import java.util.Arrays;

public class LCP18 {
    public int breakfastNumber(int[] staple, int[] drinks, int x) {
        Arrays.sort(staple);
        Arrays.sort(drinks);
        int i = 0;
        int j = drinks.length - 1;
        int ans = 0;
        while (i < staple.length && j >= 0) {
            if (staple[i] + drinks[j] > x) j--;
            else {
                ans += j + 1;
                ans = ans % 1000000007;
                i++;
            }
        }
        return ans;
    }
}
