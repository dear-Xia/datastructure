package com.datastructure.leetcode.once.tree;

import java.util.ArrayList;
import java.util.List;

public class num_589 {
    //n叉树的前序遍历
    public static List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        getResult(root,list);
        return list;
    }
    public static  void getResult(Node root,List<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        if(root.children != null){
            for(int i=0;i<root.children.size();i++){
                getResult(root.children.get(i),list);
            }
        }
    }
}
