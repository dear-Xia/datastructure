package com.datastructure.leetcode.once.tree;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class num_102 {
    //二叉树的层次遍历
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if(root == null){
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        return  getResult(queue,lists);

    }

    public static List<List<Integer>> getResult(Queue<TreeNode> queue,List<List<Integer>>lists){
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
