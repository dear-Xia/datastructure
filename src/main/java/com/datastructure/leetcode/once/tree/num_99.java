package com.datastructure.leetcode.once.tree;

import javax.jnlp.ClipboardService;
import java.util.ArrayList;

public class num_99 {
    //恢复二叉搜索树
    public void recoverTree(TreeNode root) {

    }

    /**
     * 1,判断交换的两个点
     * 目前看到的是：
     *         中序递增序列
     *      我们要做的是找到第一个后一个比前一个小，和前一个比后一个大的点，就是这个两个点了
     */

    public static ArrayList<Integer> getErrorNode(TreeNode root, ArrayList<Integer>list){
        if(root == null){
            return list;
        }

        getErrorNode(root.left,list);
        list.add(root.val);
        getErrorNode(root.right,list);

        return list;
    }

    //找到两个被交换的节点值
    public static  int[] getErrorNodeVal(ArrayList<Integer>list){
        int [] result = new int[2];
        for(int i=1;i<list.size();i++){
            if(list.get(i)<list.get(i)){

            }
        }
        return result;
    }



}
