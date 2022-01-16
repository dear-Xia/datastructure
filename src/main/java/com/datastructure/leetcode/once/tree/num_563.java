package com.datastructure.leetcode.once.tree;

import sun.reflect.generics.tree.Tree;

public class num_563 {
    //二叉树的坡度
    public static int findTilt(TreeNode root) {
        return  getResult(root,0);
    }
    public static int getResult(TreeNode root,int result){
        if(root == null){
            return 0;
        }
        getResult(root.left,result);
        result += Math.abs(getNodeNum(root.left,0)-getNodeNum(root.right,0));
        getResult(root.right,result);

        return result;
    }

    public static int getNodeNum(TreeNode root,int num){
        if(root == null){
            return 0;
        }
        getNodeNum(root.left,num);
        num += root.val;
        getNodeNum(root.right,num);
        return num;
    }

    public static void main(String[] args) {
        TreeNode root = treeNodeList.getFristTreeeNode6();

        //int nodeNum = getNodeNum(root.left);

        //int nodeNum1 = getNodeNum(root.right);

        int flage = findTilt(root);

        System.out.println(flage);
    }
}
