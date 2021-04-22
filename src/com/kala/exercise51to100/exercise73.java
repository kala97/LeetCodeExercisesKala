package com.kala.exercise51to100;

import java.util.ArrayList;

/**
 * @Description 73. 矩阵置零
 * @Version 1.0
 **/
public class exercise73 {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr.contains(j)){
                    continue;
                }
                if (matrix[i][j] == 0) {
//                    for (int x = 0; x < n; x++) {
//                        matrix[i][x] = 0;
//                    }
                    for (int y = 0; y < m; y++) {
                        matrix[y][j] = 0;
                    }
                    arr.add(j);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        exercise73 exercise73 = new exercise73();
        //[[0,1,2,0],[3,4,5,2],[1,3,1,5]]
        int[][] matrix = {{0,1,2,0}, {3, 4, 5, 2},{1,3,1,5}};
        exercise73.setZeroes(matrix);
        System.out.println(matrix);
    }
}
