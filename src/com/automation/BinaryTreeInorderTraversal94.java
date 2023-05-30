package com.automation;

import java.util.ArrayList;
import java.util.List;

 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
     TreeNode(){}
     TreeNode(int val){
         this.val=val;
     }
     TreeNode(int val, TreeNode left, TreeNode right){
         this.val = val;
         this.left = left;
         this.right = right;
     }
}
class Solution1{
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> inorderList = new ArrayList<>();

        // Recursively traverse the left subtree.
        if (root.left != null) {
            inorderList.addAll(inorderTraversal(root.left));
        }

        // Add the root node to the inorder list.
        inorderList.add(root.val);

        // Recursively traverse the right subtree.
        if (root.right != null) {
            inorderList.addAll(inorderTraversal(root.right));
        }

        return inorderList;
    }
}
public class BinaryTreeInorderTraversal94{
    public static void main(String[] args) {
        // Definition of the input binary tree.
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(7);
        root.left.right = new TreeNode(8);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);

        // Print the inorder traversal of the binary tree.
        List<Integer> inorderList = new Solution1().inorderTraversal(root);
        for (int value : inorderList) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}