package com.datastructure.leetcode.once.tree;
import sun.reflect.generics.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class num_105 {
    public static Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    //前序和中序构造树
    public static TreeNode buildTree(int[] preorder, int[] inorder) {

        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }

        return myBuildTree1(preorder,inorder,0,preorder.length-1,0, preorder.length-1);


    }

    public static  TreeNode getLocation(int[] preorder,int[] inorder,
                                        int pleft,int pright,int mleft,int mright
    ){
        if(pleft > pright){
            return null;
        }
         int proot = pleft;
        int mroot =  map.get(preorder[proot]);

        TreeNode root = new TreeNode(preorder[proot]);

        int left_size = mroot - mleft;

        root.left = getLocation(preorder,inorder,pleft+1,pleft+left_size,mleft,mroot-1);

        root.right = getLocation(preorder,inorder,pleft+left_size+1,pright,mroot+1,mright);

        return root;

    }

    public static TreeNode myBuildTree1(int[] preorder, int[] inorder, int preorder_left, int preorder_right, int inorder_left, int inorder_right) {
        if (preorder_left > preorder_right) {
            return null;
        }

        // 前序遍历中的第一个节点就是根节点
        int preorder_root = preorder_left;
        // 在中序遍历中定位根节点
        int inorder_root = map.get(preorder[preorder_root]);

        // 先把根节点建立出来
        TreeNode root = new TreeNode(preorder[preorder_root]);
        // 得到左子树中的节点数目
        int size_left_subtree = inorder_root - inorder_left;
        // 递归地构造左子树，并连接到根节点
        // 先序遍历中「从 左边界+1 开始的 size_left_subtree」个元素就对应了中序遍历中「从 左边界 开始到 根节点定位-1」的元素
        root.left = myBuildTree1(preorder, inorder, preorder_left + 1, preorder_left + size_left_subtree, inorder_left, inorder_root - 1);
        // 递归地构造右子树，并连接到根节点
        // 先序遍历中「从 左边界+1+左子树节点数目 开始到 右边界」的元素就对应了中序遍历中「从 根节点定位+1 到 右边界」的元素
        root.right = myBuildTree1(preorder, inorder, preorder_left + size_left_subtree + 1, preorder_right, inorder_root + 1, inorder_right);
        return root;
    }

    //迭代这个方法还是没有太理解
    public static TreeNode buildTree2(int[] pre,int[] in){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = new TreeNode(pre[0]);
        int index = 0;

        for(int i=1;i<pre.length;i++){
            int val = pre[i];
            TreeNode node = stack.peek();

            if(node.val != in[index]){
                node.left = new TreeNode(pre[i]);
                stack.push(node.left);
            }else {
                //处理的是出栈操作中的部分
                while (!stack.empty() && stack.peek().val == in[index]){
                    stack.pop();
                    index++;
                }
                node.right = new TreeNode(val);
                stack.push(node.right);
            }

        }
        return root;
    }

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};

        TreeNode root = buildTree(preorder,inorder);

    }

}
