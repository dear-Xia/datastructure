package com.datastructure.leetcode.once.tree;

import com.sun.javaws.jnl.MatcherReturnCode;

import java.util.Stack;

public class num_404 {
    /**
     * 相当于也是遍历树
     *广度优先遍历，只存储左叶子节点
     *考虑几种特殊场景：
     *  1，空树
     *  2，只有根节点
     *  3，只有右子树
     * @param root
     * @return
     */
    public static Integer sum = 0;
    //坐叶子之和
    public int sumOfLeftLeaves(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        if (root == null){
            return sum;
        }
        stack.push(root);
        getResult(stack);
        return sum;

    }

    public static void getResult(Stack<TreeNode> stack){
        Stack<TreeNode> stacks = new Stack<>();
        while (!stack.isEmpty()) {
            TreeNode root = stack.pop();
            if (root.left != null && (root.left.left == null && root.left.right == null)) {
                sum += root.left.val;
            }
                if (root.left != null) {
                    stacks.push(root.left);
                }
                if (root.right != null) {
                    stacks.push(root.right);
                }

            if(stack.isEmpty()){
                while (!stacks.isEmpty()){
                    stack.push(stacks.pop());
                }
            }
        }

    }

}
