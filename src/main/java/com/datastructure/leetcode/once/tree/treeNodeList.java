package com.datastructure.leetcode.once.tree;

public class treeNodeList {
    public static TreeNode getFristTreeeNode1(){
        TreeNode root = new TreeNode(0);
        return root;
    }

    public static TreeNode getFristTreeeNode2(){
        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        return root;
    }
    public static TreeNode getFristTreeeNode3(){
        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);

        return root;
    }
    public static TreeNode getFristTreeeNode4(){
        TreeNode root = new TreeNode(5);


        root.right = new TreeNode(7);
        root.right.right = new TreeNode(8);

        return root;
    }

    public static TreeNode getFristTreeeNode5(){
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        return root;
    }
    public static TreeNode getFristTreeeNode6(){
            TreeNode root = new TreeNode(4);

            root.left = new TreeNode(2);
            root.left.left = new TreeNode(3);
            root.left.right = new TreeNode(5);
            root.right = new TreeNode(9);
            root.right.right = new TreeNode(7);

        return root;
    }

    public static TreeNode getFristTreeeNode7(){
        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(6);

        root.right = new TreeNode(7);

        return root;
    }

    public static TreeNode getFristTreeeNode8(){
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(20);

        return root;
    }

    public static TreeNode getFristTreeeNode9(){
        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        return root;
    }

    public static TreeNode getFristTreeeNode10(){
        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        return root;
    }
    public static TreeNode getFristTreeeNode11(){
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(7);

        return root;
    }

}
