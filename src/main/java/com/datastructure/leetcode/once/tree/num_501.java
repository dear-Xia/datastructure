package com.datastructure.leetcode.once.tree;

import org.omg.CORBA.INTERNAL;

import java.lang.reflect.Array;
import java.util.*;

public class num_501 {
    public static void getResult(TreeNode root, Map<Integer,Integer> map){
        if(root == null){
            return;
        }
        getResult(root.left,map);
        if (map.containsKey(root.val)){
            map.put(root.val,map.get(root.val)+1);
        }else {
            map.put(root.val,1);
        }
        getResult(root.right,map);
    }
    public int[] findMode(TreeNode root) {
        Map<Integer,Integer> map  = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        getResult(root,map);
        int[] result = new int[list.size()];
        Set<Integer> set = map.keySet();
        int flage = 1;
        while (set.iterator().hasNext()){
            Integer next = set.iterator().next();
            if(next>flage){
                flage = next;
            }
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue() == flage){

            }
        }
        return result;
    }


}
