package com.kala.algorithm.exercise51to100;

import java.util.*;

public class exercise51 {
    public static void main(String[] args) {
        int n = 4;
        solveNQueens(n);
    }
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        int[] queens = new int[n];
        Arrays.fill(queens, -1);
        Set<Integer> columns = new HashSet<>();
        Set<Integer> diagonals1 = new HashSet<>();
        Set<Integer> diagonals2 = new HashSet<>();
        backtrack(ans, queens, n, 0, columns, diagonals1, diagonals2);
        return ans;
    }

    public static void backtrack(List<List<String>> ans, int[] queens, int n, int row, Set<Integer> columns, Set<Integer> diagonals1, Set<Integer> diagonals2) {
        if (row == n) {
            List<String> board = generateBoard(queens, n);
            ans.add(new ArrayList<>(board));
        } else {
            for (int i = 0; i < n; i++) {
                if (columns.contains(i)) continue;
                int diagonal1 = row - i;
                if (diagonals1.contains(diagonal1)) continue;
                int diagonal2 = row + i;
                if (diagonals2.contains(diagonal2)) continue;
                queens[row] = i;
                columns.add(i);
                diagonals1.add(diagonal1);
                diagonals2.add(diagonal2);
                backtrack(ans, queens, n, row + 1, columns, diagonals1, diagonals2);
                queens[row] = -1;
                columns.remove(i);
                diagonals1.remove(diagonal1);
                diagonals2.remove(diagonal2);
            }
        }
    }

    public static List<String> generateBoard(int[] queens, int n) {
        List<String> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char[] chars = new char[n];
            Arrays.fill(chars, '.');
            chars[queens[i]] = 'Q';
            board.add(new String(chars));
        }
        return board;
    }
}