package com.datastructure.leetcode.once.tree;

import java.util.ArrayList;
import java.util.List;

public class num_95 {
    //不同的二叉搜索树
    public static List<TreeNode> generateTrees(int n) {
        if(n == 0){
            return new ArrayList<>(null);
        }
        return getResult(1,n);
    }
    public static List<TreeNode> getResult(int start,int end){
        List<TreeNode> lists = new ArrayList<>();
        if(start>end){
            lists.add(null);
            return lists;
        }
        //选择根节点
        for(int i=start;i<=end;i++){
            List<TreeNode> leftNode = getResult(start,i-1);
            List<TreeNode> rightNode = getResult(i+1,end);

            //选择左右子树
            for(TreeNode left: leftNode){
                for(TreeNode right: rightNode){
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    lists.add(root);
                }
            }
        }
        return lists;
    }
}
