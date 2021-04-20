package com.kala.exercise51to100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class exercise57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int[][] ans = new int[n + 1][2];
        for (int i = 0; i < n; i++) {
            ans[i] = intervals[i];
        }
        ans[n] = newInterval;
        if (ans.length == 0) return new int[0][2];
        Arrays.sort(ans, (o1, o2) -> o1[0] - o2[0]);
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < ans.length; i++) {
            int left = ans[i][0], right = ans[i][1];
            if (list.size() == 0 || left > list.get(list.size() - 1)[1]) {
                list.add(ans[i]);
            } else {
                list.get(list.size() - 1)[1] = Math.max(right, list.get(list.size() - 1)[1]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
