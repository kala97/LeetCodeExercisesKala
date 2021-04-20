package com.exercise1to50;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class                      exercise46 {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> combine = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        for (int num : nums) {
            combine.add(num);
        }
        backtrack(n, 0);
        return ans;
    }

    private void backtrack(int n, int first) {
        if (first == n) {
            ans.add(new ArrayList<>(combine));
        }
        for (int i = first; i < n; i++) {
            Collections.swap(combine,first,i);
            backtrack(n, first+1);
            Collections.swap(combine,first,i);
        }
    }
}
class exercise46_1 {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> combine = new ArrayList<>();
    boolean[] vis;

    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        vis = new boolean[n];
        backtrack(n,0,nums);
        return ans;
    }

    private void backtrack(int n,int index,int[] nums) {
        if (index==n){
            ans.add(new ArrayList<>(combine));
        }
        for (int i = 0; i < n; i++) {
            if (vis[i]){
                continue;
            }
            combine.add(nums[i]);
            vis[i] = true;
            backtrack(n,index+1,nums);
            vis[i] = false;
            combine.remove(index);
        }
    }
}
