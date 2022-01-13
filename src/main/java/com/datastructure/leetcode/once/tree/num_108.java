package com.datastructure.leetcode.once.tree;

public class num_108 {
    //将数组转成平衡儿叉搜索树
    //思路就是每一次都通过二分找位置做当前范围的根节点，这样最多的结果就是
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length<1){
            return null;
        }
        return getRootLocal(nums,0,nums.length-1);
    }

    //判断每一个子树的根节点
    public static TreeNode getRootLocal(int[] nums,int start,int end){
        if(start>end){
            return null;
        }

        int location = (start+end)/2;

        TreeNode root = new TreeNode(nums[location]);

        root.left = getRootLocal(nums,start,location-1 );
        root.right = getRootLocal(nums,location+1,end);

        return root;

    }
    /**
     * 生成二叉树的模板了
     * 看到好几个题目都是这个样式生成的二叉树
     */
}
