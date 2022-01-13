package com.datastructure.leetcode.once.tree;

import java.io.StringReader;
import java.util.Stack;

public class num_98 {
    //验证二叉搜索树
    public boolean isValidBST(TreeNode root) {
        //function 1
        //return getResult(root,Long.MAX_VALUE,Long.MIN_VALUE);
        Stack<Integer> min = new Stack<>();
        getRustlt2(root,min);
        long max = Long.MAX_VALUE;
        while (!min.empty()){
            if(max > min.peek()){
                max = min.pop();
            }else {
                break;
            }
        }
        return min.empty()? true:false;
    }

    public static  boolean getResult(TreeNode root,long max,long min){
        if(root == null){
            return true;
        }

        if(root.val < max && root.val > min){
            return getResult(root.left,root.val,min) && getResult(root.right,max,root.val);
        }else {
            return false;
        }
    }

    //function 2
    public  static  void getRustlt2(TreeNode root, Stack<Integer> min){
        getRustlt2(root.left,min);
        min.push(root.val);
        getRustlt2(root.right,min);
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
    }
}
