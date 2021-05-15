package com.kala.algorithm.dailycode;

import com.kala.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 872. 叶子相似的树
 */

public class exercise872 {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        dfs(root1,list1);
        dfs(root2,list2);
        if (list1.equals(list2)){
            return true;
        }
        return false;
    }
    public void dfs(TreeNode root,List<Integer> list){
        if (root==null){
            return;
        }
        if (root.right==null&&root.left==null){
            list.add(root.val);
        }
        dfs(root.left,list);
        dfs(root.right,list);
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        exercise872 exercise872 = new exercise872();
        exercise872.leafSimilar(root1,root2);
    }
}
