package com.automation;


class TreeNode1 {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode1(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class Solution2{
    public static int maxDepth(TreeNode root){
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}

    public class MaximumDepthBinaryTree104{
    public static void main(String[] args){
        // Create the binary tree: [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        MaximumDepthBinaryTree104 solution = new MaximumDepthBinaryTree104();
        int maxDepth = Solution2.maxDepth(root);

        System.out.println("Maximum Depth of the Binary Tree: " + maxDepth);
    }
}