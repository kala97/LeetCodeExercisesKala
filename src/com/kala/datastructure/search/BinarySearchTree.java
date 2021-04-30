package com.kala.datastructure.search;

import com.kala.common.TreeNode;

/**
 * 二叉搜索树的各种方法
 */

public class BinarySearchTree {
    /**
     * 搜索方法
     */
    public boolean searchBST(TreeNode root, int target) {
        if (null == root) {
            return false;
        } else if (root.val == target) {
            return true;
        } else if (root.val > target) {
            return searchBST(root.left, target);
        } else {
            return searchBST(root.right, target);
        }
    }

    /**
     * 插入完全不相等方法
     */
    public boolean insertBST(TreeNode root, int target) {
        if (!searchBST(root, target)) {
            insert(root, target);
            return true;
        } else {
            return false;
        }
    }

    /**
     * 插入方法
     */
    public void insert(TreeNode root, int target) {
        if (root.val > target) {
            if (null == root.left) {
                root.left = new TreeNode(target);
            } else {
                insert(root.left, target);
            }
        } else {
            if (null == root.right) {
                root.right = new TreeNode(target);
            } else {
                insert(root.right, target);
            }
        }
    }

    /**
     * 删除二叉搜索树节点的方法
     */
    public boolean deleteBST(TreeNode root, int target) {
        if (null == root) {
            return false;
        } else {
            if (target == root.val) {
                delete(root, target);
                return true;
            } else if (target > root.val) {
                return deleteBST(root.right, target);
            } else {
                return deleteBST(root.left, target);
            }
        }
    }

    /**
     * 删除节点的方法
     */
    public void delete(TreeNode root, int target) {
        if (null == root.right) {
            root = root.left;
        } else if (null == root.left) {
            root = root.right;
        } else {
            TreeNode temp = root.left;
            TreeNode temq = new TreeNode();
            while (temp.right!=null){
                temq =temp;
                temp = temp.right;
            }
            root.val = temp.val;
            temq.right = temp.left;
        }
    }

    public static void main(String[] args) {
        int[] node = {20, 5, 6, 3, 4, 9, 1, 8, 7, 10,24,35,64,32,23};
        TreeNode root = new TreeNode();
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        for (int i : node) {
            binarySearchTree.insertBST(root, i);
        }
//        boolean b = binarySearchTree.searchBST(root, 2);
//        System.out.println(b);
        binarySearchTree.deleteBST(root,20);
    }
}
