package com.datastructure.leetcode.once.tree;

import java.util.Stack;

public class num_559 {
    //n叉树深度
    public int maxDepth(Node root) {
        if(root == null){
            return 0;
        }
        int length = 0;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        Stack<Node> stack1 = new Stack<>();
        while (!stack.isEmpty()){
            Node pNode = stack.pop();
            if(pNode.children != null){
                for(int i=0;i<pNode.children.size();i++){
                    stack1.push(pNode.children.get(i));
                }
            }
            if(stack.isEmpty()){
                while (!stack1.isEmpty()){
                    stack.push(stack1.pop());
                }
                length++;
            }
        }
        return length;
    }
}
