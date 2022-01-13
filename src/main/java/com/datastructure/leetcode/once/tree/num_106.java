package com.datastructure.leetcode.once.tree;

import java.util.HashMap;
import java.util.Map;

public class num_106 {
    public static Map map  = new HashMap<Integer,Integer>();;
    //中序和后续构造树  和前序的差不多
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }


        return getTree(inorder,postorder,0,inorder.length-1,0,inorder.length-1);
    }

    public static TreeNode getTree(int[] in ,int [] post,int mleft,int mright,int pleft,int pright){
        //出口
        if(pleft>pright || pright<0){
            return null;
        }
        //创建节点
        TreeNode root = new TreeNode(post[pright]);

        //获取中序中的根节点
        int minRoot = (int) map.get(post[pright]);

        //获取右子树节点个数
        int num = mright-minRoot;

        root.left = getTree(in,post,mleft,minRoot-1,pleft,pright-num-1);

        root.right = getTree(in,post,mright-num+1,mright,pright-num,pright-1);

        return root;
    }

    public static void main(String[] args) {
        int[] preorder = {9,15,7,20,3};
        int[] inorder = {9,3,15,20,7};
        TreeNode root = buildTree(inorder,preorder);
        System.out.println(root);

    }


}
