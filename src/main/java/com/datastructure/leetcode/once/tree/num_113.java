package com.datastructure.leetcode.once.tree;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.Stack;

public class num_113 {
    //满足根到叶子节点和等于target的所有列表
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        Stack<TreeNode> stack = new Stack<>();
        List<List<Integer>>lists = new ArrayList<>();
        return null;
    }

    public static List<Integer> getTreeList(Stack<TreeNode> stack,int targetSum,int tmpSum){
        if(stack == null){
            return null;
        }
        TreeNode pNode = stack.peek();
        tmpSum = tmpSum+pNode.val;
        if(tmpSum == targetSum){
            if(pNode.left == null && pNode.right == null){
                List<Integer> list = new ArrayList<>();
                Stack<TreeNode> stack1 = new Stack<>();

            }
        }
        return  null;
    }
}
