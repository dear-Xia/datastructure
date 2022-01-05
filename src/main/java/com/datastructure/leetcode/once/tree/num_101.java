package com.datastructure.leetcode.once.tree;

import sun.reflect.generics.tree.Tree;

public class num_101 {
    //判断二叉树是否是镜像树
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return getResutl(root.left,root.right);
    }

    public static boolean getResutl(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left != null && right != null && left.val == right.val){
            return getResutl(left.left,right.right) && getResutl(left.right,right.left);
        }else {
            return false;
        }
    }
}
