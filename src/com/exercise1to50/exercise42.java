package com.exercise1to50;

public class exercise42 {
    public static int trap(int[] height) {
        int left = 0, right = 0, water = 0;
        int length = height.length;
        for (int i = 0; i < length - 1; i++) {
            if (height[i] > height[i + 1]) {
                left = i;
                right = i + 1;
                for (int i1 = left + 2; i1 < length; i1++) {
                    if (height[i1] >= height[left]) {
                        right = i1;
                        break;
                    } else if (height[i1] > height[right]) {
                        right = i1;
                    }
                }
                if (right>i+1){
                    int min = Math.min(height[left], height[right]);
                    for (int j = left+1; j <right; j++) {
                        water+=min-height[j];
                    }
                    i+=right-left-1;
                }
            }
        }
        return water;
    }

    public static void main(String[] args) {
        trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
    }
}
