package com.datastructure.leetcode.once.tree;

import sun.reflect.generics.tree.Tree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class num_671 {
    //获取树中的次小节点
    public int findSecondMinimumValue(TreeNode root) {
        Set<Integer>set = new HashSet<>();
        getResult(root,set);
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        if(set.size()<2){
            return -1;
        }else {
            //set获取元素
            for (Integer integer : set) {
                if(integer < b){
                    b = integer;
                }
                if(a>b){
                    int flage = b;
                    b = a;
                    a = flage;
                }
            }
        }
        return b;

    }

    public static void getResult(TreeNode root, Set<Integer> set){
        if(root == null){
            return;
        }
        getResult(root.left,set);
        set.add(root.val);
        getResult(root.right,set);
    }
}
