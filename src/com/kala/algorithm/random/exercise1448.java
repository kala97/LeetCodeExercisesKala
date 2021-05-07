package com.kala.algorithm.random;

import com.kala.common.TreeNode;

/**
 * 1448. 统计二叉树中好节点的数目
 */

public class exercise1448 {
    int count = 0;
    public int goodNodes(TreeNode root) {
        dfs(root, root.val);
        return count;
    }

    public void dfs(TreeNode root, int max) {
        if (root == null){
            return;
        }
        if (root.val>=max){
            count++;
            max = root.val;
        }
        dfs(root.left,max);
        dfs(root.right,max);
    }
}
