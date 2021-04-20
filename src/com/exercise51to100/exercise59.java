package com.exercise51to100;

public class exercise59 {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num;
                num++;
            }
            for (int i = top + 1; i <= bottom; i++) {
                matrix[i][right] = num;
                num++;
            }
            if (left < right && top < bottom) {
                for (int i = right - 1; i > left; i--) {
                    matrix[bottom][i] = num;
                    num++;
                }
                for (int i = bottom; i > top; i--) {
                    matrix[i][left] = num;
                    num++;
                }
            }
            left++;
            top++;
            right--;
            bottom--;
        }
        return matrix;
    }

    public static void main(String[] args) {
        generateMatrix(3);
    }
}
