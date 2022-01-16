package com.datastructure.leetcode.once.tree;

import sun.reflect.generics.tree.Tree;

import java.util.Stack;

public class num_543 {
    public static int diameterOfBinaryTree(TreeNode root) {

        if(root == null){
            return 0;
        }

        return getMax(root,0);
    }
    public static int getMax(TreeNode root,int max){
        if(root == null){
            return max;
        }
        if(getResult(root.right)+getResult(root.left) > max){
            max = getResult(root.right)+getResult(root.left);
        }
        if(root.left != null) {
            max = getMax(root.left, max);
        }
        if(root.right != null) {
            max = getMax(root.right, max);
        }

        return max;
    }
    //广度优先遍历获取深度
    public static int getResult(TreeNode root){
        if(root == null){
            return 0;
        }
        int result = 0;
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> stack1 = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode pNode = stack.pop();
            if(pNode.left!= null){
                stack1.push(pNode.left);
            }
            if(pNode.right!= null){
                stack1.push(pNode.right);
            }
            if(stack.isEmpty()){
                while (!stack1.isEmpty()){
                    stack.push(stack1.pop());
                }
                result++;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        diameterOfBinaryTree(root);
    }
}
