package com.datastructure.leetcode.once.tree;

import sun.font.CreatedFontTracker;
import sun.reflect.generics.tree.Tree;

public class num_965 {

    public static boolean isUnivalTree(TreeNode root) {
        if(root == null){
            return true;
        }
        return  getOrelse(root,root.val);
    }

    public static boolean getOrelse(TreeNode root,int num){
        if(root == null){
            return true;
        }
        if(root.val == num){
            return true && getOrelse(root.left,num) && getOrelse(root.right,num);
        }else {
            return false;
        }
    }
}
