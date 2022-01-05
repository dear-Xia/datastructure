package com.datastructure.leetcode.once.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class num_103 {
    //锯齿状输出
    public  List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<List<Integer>> lists = new ArrayList<>();
        if(root == null ){
            return lists;
        }
        stack.push(root);
        int control = 0;
        getObjectSignle(lists,stack,control);
        return lists;
    }
    public  void getObjectSignle(List<List<Integer>> lists, Stack<TreeNode> stack,int control){
        if(stack == null || stack.empty()) {
            return;
        }
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> next = new Stack<>();
        while (!stack.empty()){
            TreeNode flage = stack.pop();
            if(control%2 == 0){
                if(flage.left != null){
                    next.push(flage.left);}
                if(flage.right != null ){
                    next.push(flage.right);}
            }else {
                if(flage.right != null){
                    next.push(flage.right);}
                if(flage.left != null ){
                    next.push(flage.left);}
            }
            list.add(flage.val);
        }
        lists.add(list);
        getObjectSignle(lists,next,control+1);
    }
}
