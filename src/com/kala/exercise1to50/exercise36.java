package com.kala.exercise1to50;

import java.util.HashMap;

public class exercise36 {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, Integer>[] rows = new HashMap[9];
        HashMap<Integer, Integer>[] columns = new HashMap[9];
        HashMap<Integer, Integer>[] boxes = new HashMap[9];
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashMap<>();
            columns[i] = new HashMap<>();
            boxes[i] = new HashMap<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = (int) board[i][j];
                    int boxesIndex = (i / 3) * 3 + j / 3;

                    rows[i].put(num, rows[i].getOrDefault(num, 0) + 1);
                    columns[j].put(num, columns[j].getOrDefault(num, 0) + 1);
                    boxes[boxesIndex].put(num, boxes[boxesIndex].getOrDefault(num, 0) + 1);

                    if (rows[i].get(num) > 1 || columns[j].get(num) > 1 || boxes[boxesIndex].get(num) > 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
