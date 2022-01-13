package com.datastructure.leetcode.once.tree;

import java.util.Stack;

public class num_112 {

    //典型的树遍历+回溯
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return getResult(root,0,targetSum);


    }

    //双队列，一个队列存储节点，一个队列存储当前节点到根节点的距离，最后判断距离是否相等，同时判断节点是否是叶子
    public static boolean checkTreeNode(TreeNode root,Stack<TreeNode> stack,int tmp ,int target){
        if(root == null){
            return false;
        }
        if(root.val+tmp > target){
            return false;
        }
        if(root.left == null && root.right == null && root.val+tmp == target){
            return true;
        }
        return false;

    }

    //深度优先遍历
    public  static  boolean getResult(TreeNode root,int tmp,int targetSUm){
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null){
            return root.val+tmp == targetSUm;
        }
        return getResult(root.left,tmp+root.val,targetSUm)||getResult(root.right,tmp+root.val,targetSUm);
    }





}
