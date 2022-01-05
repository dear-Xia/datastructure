package com.datastructure.leetcode.once.tree;

import java.util.*;

public class num_107 {
    // 层次遍历 102的变形
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if(root == null){
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        Stack<List<Integer>> stack = new Stack<>();
        Stack<List<Integer>> stacks =  getResult(queue,stack);
        while (!stacks.empty()){
            lists.add(stacks.pop());
        }
        return lists;
    }

    public static Stack<List<Integer>> getResult(Queue<TreeNode> queue, Stack<List<Integer>>lists){
        Queue<TreeNode> queues = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()){
            TreeNode root = queue.poll();
            if(root.left != null){
                queues.add(root.left);
            }
            if(root.right != null){
                queues.add(root.right);
            }
            list.add(root.val);
        }
        lists.add(list);
        if(!queues.isEmpty()){
            getResult(queues,lists);
        }
        return lists;
    }

}
