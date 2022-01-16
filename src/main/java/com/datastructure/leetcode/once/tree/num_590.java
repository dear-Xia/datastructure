package com.datastructure.leetcode.once.tree;

import java.util.ArrayList;
import java.util.List;

public class num_590 {
    //n叉树的后续遍历
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        getResult(root,list);

        return list;
    }

    public static void getResult(Node root,List<Integer> list){
        if(root == null){
            return;
        }
        if(root.children != null){
            for(int i=0;i<root.children.size();i++){
                getResult(root.children.get(i),list);
            }
        }
        list.add(root.val);
    }
}
