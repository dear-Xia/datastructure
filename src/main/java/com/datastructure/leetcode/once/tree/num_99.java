package com.datastructure.leetcode.once.tree;

import javax.jnlp.ClipboardService;
import java.util.ArrayList;
import java.util.List;

public class num_99 {
    //恢复二叉搜索树
    public void recoverTree(TreeNode root) {

    }

    public static void recoverTree1(TreeNode root) {
        if(root == null){
            return;
        }
        List<Integer> list = new ArrayList<>();
        getVal(root,list);
        int[] result = getError(list);
        recover(root,result[0],result[1]);
    }
    public static void recover(TreeNode root,int x,int y){
        if(root == null){
            return;
        }
        if(root.val == x || root.val == y){
            root.val = root.val==x ? y:x;
        }
        recover(root.left,x,y);
        recover(root.right,x,y);
    }
    public static int[] getError(List<Integer> list){

        int flage1 = -1;
        int flage2 = -1;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                flage2 = i+1;
                if(flage1 == -1){
                    flage1 = i;
                }else {
                    break;
                }
            }
        }
        return new int[]{list.get(flage1),list.get(flage2)};

    }
    public static void getVal(TreeNode root,List<Integer> list){
        if(root == null){
            return;
        }
        getVal(root.left,list);
        list.add(root.val);
        getVal(root.right,list);
    }



}
