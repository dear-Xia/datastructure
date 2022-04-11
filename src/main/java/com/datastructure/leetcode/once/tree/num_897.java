package com.datastructure.leetcode.once.tree;

import sun.reflect.generics.tree.Tree;

public class num_897 {

    public static TreeNode increasingBST(TreeNode root) {
        TreeNode result = null;
        if(root == null){
            return root;
        }else {
            getNewTree(root,result);
            return result;
        }
    }

    public static void getNewTree(TreeNode root, TreeNode treeNode){
        if(root == null){
            return;
        }
        getNewTree(root.left,treeNode);
        System.out.println(root.val);
        TreeNode treeNode1 = root;
        treeNode.right = treeNode1;
        getNewTree(root.right,treeNode1);
    }

    public static void main(String[] args) {
        TreeNode fristTreeeNode9 = treeNodeList.getFristTreeeNode9();
        TreeNode treeNode = increasingBST(fristTreeeNode9);
    }
}
