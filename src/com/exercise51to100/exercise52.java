package com.exercise51to100;

import java.util.HashSet;
import java.util.Set;

public class exercise52 {
    public static void main(String[] args) {
        int n = 4;
        totalNQueens(n);
    }
    public static int totalNQueens(int n) {
        Set<Integer> columns = new HashSet<>();
        Set<Integer> diagonals1 = new HashSet<>();
        Set<Integer> diagonals2 = new HashSet<>();
        int count = backtrack(n, 0, columns, diagonals1, diagonals2);
        return count;
    }

    public static int backtrack(int n, int row, Set<Integer> columns, Set<Integer> diagonals1, Set<Integer> diagonals2) {
        if (row == n) {
            return 1;
        } else {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (columns.contains(i)) continue;
                int diagonal1 = row - i;
                if (diagonals1.contains(diagonal1)) continue;
                int diagonal2 = row + i;
                if (diagonals2.contains(diagonal2)) continue;
                columns.add(i);
                diagonals1.add(diagonal1);
                diagonals2.add(diagonal2);
                count+=backtrack(n, row + 1, columns, diagonals1, diagonals2);
                columns.remove(i);
                diagonals1.remove(diagonal1);
                diagonals2.remove(diagonal2);
            }
            return count;
        }
    }
}
