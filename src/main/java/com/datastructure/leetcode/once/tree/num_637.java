package com.datastructure.leetcode.once.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class num_637 {
    //二叉树的层平均值
    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        Stack<TreeNode> stack1 = new Stack<>();
        double sum = 0.0;
        int num = 0;
        while (!stack.isEmpty()){
            TreeNode pNode = stack.pop();
            if(pNode.left != null){
                stack1.push(pNode.left);
            }
            if(pNode.right != null){
                stack1.push(pNode.right);
            }
            sum += pNode.val;
            num++;

            if(stack.isEmpty()){
                while (!stack1.isEmpty()){
                    stack.push(stack1.pop());
                }
                list.add(sum/num);
                sum = 0.0;
                num = 0;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        /*double a = 9.0;
        int aa =2;
        System.out.println(a/aa);*/
        TreeNode root = treeNodeList.getFristTreeeNode8();
        averageOfLevels(root);
    }
}
