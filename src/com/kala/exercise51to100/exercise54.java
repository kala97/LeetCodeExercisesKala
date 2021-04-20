package com.kala.exercise51to100;

import java.util.ArrayList;
import java.util.List;

public class exercise54 {
    public static void main(String[] args) {
        int[][] matrix = {{5, 9, 7}};
        spiralOrder(matrix);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return ans;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = n - 1, top = 0, bottom = m - 1;
        while (left <= right && top <= bottom) {
            for (int colunms = left; colunms <= right; colunms++) {
                ans.add(matrix[top][colunms]);
            }
            for (int row = top + 1; row <= bottom; row++) {
                ans.add(matrix[row][right]);
            }
            if (left < right && top < bottom) {
                for (int columns = right - 1; columns >= left + 1; columns--) {
                    ans.add(matrix[bottom][columns]);
                }
                for (int row = bottom; row >= top + 1; row--) {
                    ans.add(matrix[row][left]);
                }
            }
            left++;
            top++;
            right--;
            bottom--;
        }
        return ans;
    }
}
