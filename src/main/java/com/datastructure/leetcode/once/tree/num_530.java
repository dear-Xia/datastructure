package com.datastructure.leetcode.once.tree;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class num_530 {
    public static int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        getResult(root,list);
        list.sort(Comparator.naturalOrder());
        int start = list.get(0);
        int length = Integer.MAX_VALUE;
        for(int i=1;i<list.size();i++){
            if(list.get(i)-start < length){
                length =list.get(i)-start;
            }
            start = list.get(i);
        }
        return length;
    }

    public static void getResult(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        getResult(root.left,list);
        list.add(root.val);
        getResult(root.right,list);
    }

    public static void main(String[] args) {
        TreeNode root =treeNodeList.getFristTreeeNode5();
        int flage = getMinimumDifference(root);
        System.out.println(flage);
    }
}
