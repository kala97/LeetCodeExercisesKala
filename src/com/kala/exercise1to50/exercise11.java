package com.kala.exercise1to50;

public class exercise11 {
    public int maxArea(int[] height) {
        int max = 0;
        int high = 0;
        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = 1; j < height.length; j++) {
                high = Math.min(height[i], height[j]);
                ans = (j - i) * high;
                max = Math.max(ans, max);
            }
        }
        return max;
    }

    public int maxArea1(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;
        int ans;
        while (l < r) {
            ans = Math.min(height[l], height[r]) * (r - l);
            max = Math.max(ans, max);
            if (height[r] > height[l]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}
