package com.common;

public class Factoria {
    public int factoria(int n){
        if (n==0) return 1;
        if (n<0) return 0;
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans*=i;
        }
        return ans;
    }
}
