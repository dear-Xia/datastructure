package com.datastructure.leetcode.once.tree;

import javax.xml.stream.events.StartDocument;
import java.util.Stack;

public class num_653 {
    //对于bsf，两个节点之和为target true
    public static boolean findTarget(TreeNode root, int k) {
        boolean flage = false;

        if(root == null){
            return flage;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        Stack<TreeNode> stack1 = new Stack<>();
        while (!stack.isEmpty()){
            TreeNode pNiode = stack.pop();
            if(checkNode(root,k-pNiode.val)){
                flage = true;
                break;
            }
            if(root.left != null){
                stack1.push(root.left);
            }
            if(root.right != null){
                stack1.push(root.right);
            }

            if(stack.isEmpty() && !stack1.isEmpty()){
                while (!stack1.isEmpty()){
                    stack.push(stack1.pop());
                }
            }
        }
        return flage;
    }

    //遍历节点，获取等于当前值的节点
    public static boolean checkNode(TreeNode root,int target){
        boolean flage = false;
        if( root == null ){
            return flage;
        }
        while (root != null){
            if(root.val > target){
                root = root.left;
            }
            if(root.val < target){
                root = root.right;
            }
            if(root == null){
                break;
            }
            if( root.val == target){
                flage = true;
                break;
            }
        }
        return flage;
    }

    public static void main(String[] args) {
        TreeNode root = treeNodeList.getFristTreeeNode9();
        System.out.println(findTarget(root,28));
    }
}
