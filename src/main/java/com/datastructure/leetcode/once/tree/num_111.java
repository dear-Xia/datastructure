package com.datastructure.leetcode.once.tree;

import java.util.LinkedList;
import java.util.Queue;

public class num_111 {
    //二叉树的最小深度
    public static int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        //广度优先遍历
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> queue1 = new LinkedList<>();
        queue.add(root);
        int depth = 1;

        while (!queue.isEmpty() || !queue1.isEmpty() ){
            if(queue.isEmpty()){
                while (!queue1.isEmpty()){
                    queue.add(queue1.poll());
                }
                depth++;
            }
            TreeNode node = queue.poll();
            if(node.left == null && node.right == null){
                break;
            }
            if(node.left != null) {
                queue1.add(node.left);
            }
            if(node.right != null) {
                queue1.add(node.right);
            }
        }
        return depth;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(2);
        node1.right = new TreeNode(3);
        node1.right.right = new TreeNode(4);
        System.out.println(minDepth(node1));
    }
}
