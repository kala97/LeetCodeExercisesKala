package com.kala.exercise1to50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class exercise47 {
    static List<List<Integer>> ans = new ArrayList<>();
    static List<Integer> combine = new ArrayList<>();
    static boolean[] vis;

    public static List<List<Integer>> permuteUnique(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        vis = new boolean[n];
        backtrack(n, 0, nums);
        return ans;
    }

    private static void backtrack(int n, int index, int[] nums) {
        if (index == n) {
            ans.add(new ArrayList<>(combine));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (vis[i] || (i > 0 && nums[i] == nums[i - 1] && !vis[i-1])) {
                continue;
            }
            combine.add(nums[i]);
            vis[i] = true;
            backtrack(n, index + 1, nums);
            vis[i] = false;
            combine.remove(index);
        }
    }

    public static void main(String[] args) {
        System.out.println(permuteUnique(new int[]{1, 1, 2}));
    }
}
