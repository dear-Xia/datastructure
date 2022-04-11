package com.datastructure.leetcode.once.tree;

import java.util.ArrayList;
import java.util.List;

public class num_872 {

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        getTreeNode(list1,root1);
        getTreeNode(list2,root2);
        if(list1.equals(list2)){
            return true;
        }else {
            return false;
        }
    }
    public static void getTreeNode(List<Integer> list,TreeNode root1){
        if(root1 == null ) {
            return ;
        }
        getTreeNode(list,root1.left);
        if(root1.left == null && root1.right == null && root1 != null){
            list.add(root1.val);
        }
        getTreeNode(list,root1.right);
    }

    public static void main(String[] args) {
        TreeNode fristTreeeNode11 = treeNodeList.getFristTreeeNode11();
        TreeNode fristTreeeNode9 = treeNodeList.getFristTreeeNode9();

        leafSimilar(fristTreeeNode11,fristTreeeNode9);
    }
}
