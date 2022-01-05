package com.datastructure.leetcode.once.tree;

import java.util.ArrayList;
import java.util.List;

public class num_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        getResult(root,list);
        return list;

    }

    public void getResult(TreeNode root,List<Integer> list){
        if(root == null){
            return;
        }
        getResult(root.left,list);
        list.add(root.val);
        getResult(root.right,list);
    }
}
