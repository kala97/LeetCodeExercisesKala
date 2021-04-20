package com.Others;

import java.util.*;

public class zhaoyinwangluoTest1 {
    int max = 0;

    public int maxNum(int[] a, int[] b) {
        dfs(a, b, 0, a.length - 1, 0, 0);
        return max;
    }

    public void dfs(int[] a, int[] b, int left, int right, int index, int sum) {
        if (left > right & index == b.length) {
            max = Math.max(max, sum);
            return;
        }

        dfs(a, b, left + 1, right, index + 1, sum + a[left] * b[index]);
        dfs(a, b, left, right - 1, index + 1, sum + a[right] * b[index]);
    }
//    int max = 0;
//
//    public int maxvalue(int[] a, int[] b) {
//        dfs(a, b, 0, a.length - 1, 0, 0);
//        return max;
//    }
//
//    public void dfs(int[] a, int[] b, int i, int j, int k, int total) {
//        if (i > j & k == b.length) {
//            max = Math.max(max, total);
//            return;
//        }
//
//
//        dfs(a, b, i + 1, j, k + 1, total + a[i] * b[k]);
//        dfs(a, b, i, j - 1, k + 1, total + a[j] * b[k]);
//    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 2, 4};
        int[] b = {1, 2, 3, 4, 5};
        zhaoyinwangluoTest1 zhaoyinwangluoTest1 = new zhaoyinwangluoTest1();
        int maxvalue = zhaoyinwangluoTest1.maxNum(a, b);
        System.out.println(maxvalue);
        Map<Integer,Integer> map = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        Queue<String> queue = new LinkedList<>();
        }
        String s1 = "Easd";
        s1.equalsIgnoreCase()
    }
}
