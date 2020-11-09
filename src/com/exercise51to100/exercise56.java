package com.exercise51to100;

import java.util.*;

public class exercise56 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][2];
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        List<int[]> ans = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int l = intervals[i][0],r = intervals[i][1];
            if (ans.size()==0||ans.get(ans.size()-1)[1]<l){
                ans.add(new int[]{l,r});
            }else {
                ans.get(ans.size()-1)[1] = Math.max(r,ans.get(ans.size()-1)[1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
