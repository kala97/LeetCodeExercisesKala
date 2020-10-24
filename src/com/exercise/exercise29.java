package com.exercise;

public class exercise29 {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) return 0;
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        long a = Math.abs((long) dividend);
        long b = Math.abs((long)divisor);
        int result = 0;
        boolean negative  = (dividend^divisor)<0;
        for (int i = 31; i >= 0; i--) {
            if ((a>>i) >=b){
                result = result+(1<<i);
                a = a - (b<<i);
            }
        }
        return negative?-result:result;
    }
}
