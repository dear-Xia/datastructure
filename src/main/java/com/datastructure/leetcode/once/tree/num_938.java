package com.datastructure.leetcode.once.tree;

public class num_938 {

    public static int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null){
            return 0;
        }
        if(root.val < low){
            return  rangeSumBST(root.right,low,high);
        }
        if(root.val < high){
            return rangeSumBST(root.left,low,high);
        }
        return root.val+ rangeSumBST(root.left,low,high) + rangeSumBST(root.right,low,high);
    }

    /*public static void getSum(TreeNode treeNode,int low,int high){
        if(treeNode == null){
            return;
        }
        getSum(treeNode.left,low,high);
        if(treeNode.val > low && treeNode.val < high){
            sum += treeNode.val;
        }
        getSum(treeNode.right,low,high);
    }*/
}
