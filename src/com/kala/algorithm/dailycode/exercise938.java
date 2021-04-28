package com.kala.algorithm.dailycode;

import com.kala.common.TreeNode;

/**
 * 938. 二叉搜索树的范围和
 */

public class exercise938 {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (null == root) {
            return 0;
        }
        if (root.val > high) {
            return rangeSumBST(root.left, low, high);
        }
        if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        }
        return root.val + rangeSumBST(root.right, low, high) + rangeSumBST(root.left, low, high);
    }
}
