package com.kala.algorithm.exercise800to900;

import com.kala.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 897. 递增顺序搜索树
 * @Version 1.0
 **/
public class exercise897 {
    public TreeNode increasingBST(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        TreeNode dummy = new TreeNode(-1);
        TreeNode temp = dummy;
        InOrderTraverse(root,ans);
        for (Integer value : ans) {
            temp.right = new TreeNode(value);
            temp = temp.right;
        }
        return dummy.right;
    }
    public void InOrderTraverse(TreeNode root,List<Integer> ans){
        if (root == null){
            return;
        }
        InOrderTraverse(root.left,ans);
        ans.add(root.val);
        InOrderTraverse(root.right,ans);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(2,new TreeNode(1),new TreeNode(3));
        exercise897 exercise897 = new exercise897();
        TreeNode node = exercise897.increasingBST(treeNode);
    }
}
