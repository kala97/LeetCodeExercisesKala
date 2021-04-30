package com.kala.algorithm.dailycode;

import java.util.Arrays;

/**
 * 403. 青蛙过河
 */

public class exercise403 {
    private Boolean rec[][];

    public boolean canCross(int[] stones) {
        int n = stones.length;
        rec = new Boolean[n][n];
        return dfs(stones, 0, 0);
    }

    private boolean dfs(int[] stones, int i, int lastdis) {
        if (i == stones.length - 1) {
            return true;
        }
        if (rec[i][lastdis] != null) {
            return rec[i][lastdis];
        }
        for (int curdis = lastdis - 1; curdis <= lastdis + 1; curdis++) {
            if (curdis>0){
                int j = Arrays.binarySearch(stones, i+1, stones.length, curdis+stones[i]);
                if (j > 0 && dfs(stones, j, curdis)) {
                    return rec[i][lastdis] = true;
                }
            }
        }
        return rec[i][lastdis] = false;
    }
}
