package com.datastructure.leetcode.once.tree;

public class num_700 {
    //判断树是否含有节点
    public static TreeNode searchBST(TreeNode root, int val) {
        TreeNode node = null;
        if(root == null){
            return node;
        }

        while (root!= null){
            if(root.val > val){
                root = root.left;
            } else if(root.val < val){
                root = root.right;
            } else{
                node = root;
                break;
            }
        }
        return  node;
    }

    public static void main(String[] args) {
        TreeNode root = treeNodeList.getFristTreeeNode10();
        searchBST(root,5);
    }
}
