package com.datastructure.leetcode.once.tree;

import java.util.LinkedList;
import java.util.Queue;

public class num_104 {
    //二叉树的深度
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        return getResult(queue,1);
    }

    public static int getResult(Queue<TreeNode>queue,int result){
        Queue<TreeNode>queues = new LinkedList<>();
        while (!queue.isEmpty()){
            TreeNode root = queue.poll();
            if(root.left != null){
                queues.add(root.left);
            }
            if(root.right != null){
                queues.add(root.right);
            }
        }
        if(!queues.isEmpty()){
            return  getResult(queues,result+1);
        }else {
            return result;
        }

    }

    //更好的方法
    public static int getResultTwo(TreeNode root){
        if(root == null) {return 0;}
        return Math.max(getResultTwo(root.left),getResultTwo(root.right))+1;
    }
}
