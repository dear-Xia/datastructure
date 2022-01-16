package com.datastructure.leetcode.once.tree;

public class num_572 {
    //判断一个树是另一个树的子树
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null){
            return true;
        }
        boolean flage = false;
        if(root.left != null) {
            flage = flage || isSubtree(root.left, subRoot);
        }
        if(root.val == subRoot.val){
            flage = flage || checkSamTree(root,subRoot);
        }
        if(root.right != null) {
            flage = flage || isSubtree(root.right, subRoot);
        }
        return flage;
    }
    public static boolean checkSamTree(TreeNode root,TreeNode subRoot){
        if(root == null && subRoot == null){
            return true;
        }
        if(root != null && subRoot != null){
            if(root.val == subRoot.val){
                return checkSamTree(root.left,subRoot.left)&& checkSamTree(root.right,subRoot.right);
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        TreeNode root = treeNodeList.getFristTreeeNode5();
        TreeNode sonTree = treeNodeList.getFristTreeeNode7();
        boolean subtree = isSubtree(root, sonTree);
        System.out.println(subtree);
    }
}
