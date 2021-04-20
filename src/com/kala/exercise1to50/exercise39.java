package com.kala.exercise1to50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exercise39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combine = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, target, 0, ans, combine);
        return ans;
    }

    public void dfs(int[] candidates, int target, int index, List<List<Integer>> ans, List<Integer> combine) {
        if (index == candidates.length) {
            return;
        }
        if (target == 0) {
            ans.add(new ArrayList<>(combine));
            return;
        }

        dfs(candidates, target, index + 1, ans, combine);

        if (target - candidates[index] >= 0) {
            combine.add(candidates[index]);
            dfs(candidates, target-candidates[index], index, ans, combine);
            combine.remove(combine.size() - 1);
        }
    }
}
