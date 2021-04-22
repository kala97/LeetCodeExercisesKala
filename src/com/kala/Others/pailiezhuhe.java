package com.kala.Others;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class pailiezhuhe {

    public Set<List<Integer>> zuhe(){
        int[] num = new int[100];
        for (int i = 0; i < num.length; i++) {
            num[i] = i+1;
        }
        HashSet<List<Integer>> hashSet = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        dfs(num,100,hashSet,list,0);
        return hashSet;
    }


    public void dfs(int[] num,int target,Set<List<Integer>> list,List<Integer> ans,int index){
        if (target == 0){
            list.add(ans);
            return;
        }
        if (index>num.length-1||target<0){
            ans.remove(ans.size()-1);
            return;
        }
        ans.add(num[index]);
        dfs(num,target-num[index],list,ans,index+1);

    }

    public static void main(String[] args) {
        pailiezhuhe pailiezhuhe = new pailiezhuhe();
        Set<List<Integer>> zuhe = pailiezhuhe.zuhe();
        System.out.println(zuhe);
    }
}
