package com.exercise51to100;

public class exercise63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] cur = new int[n];
        cur[0] = obstacleGrid[0][0] == 0 ? 1 : 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j]==1){
                    cur[j] = 0;
                    continue;
                }
                if (j-1>=0&&obstacleGrid[i][j-1]==0){
                    cur[j]+=cur[j-1];
                }
            }
        }
        return cur[n-1];
    }
}
