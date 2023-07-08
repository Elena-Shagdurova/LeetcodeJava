package com.automation;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-13, -12, -11, -10, -8, -7, -3, 0, 2, 3, 4, 5, 6, 9, 10};

        TreeNode2 root = sortedArrayToBST(nums);

        // Perform any operations or traversals on the constructed tree as needed
        // For example, printing the tree using inorder traversal
        System.out.println("Binary Search Tree:");
        printTree(root, 0);
    }

    public static TreeNode2 sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        return constructBST(nums, 0, nums.length - 1);
    }

    private static TreeNode2 constructBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode2 node = new TreeNode2(nums[mid]);
        node.left = constructBST(nums, start, mid - 1);
        node.right = constructBST(nums, mid + 1, end);

        return node;
    }
      // to perform an inorder traversal of the constructed tree.
      // This method prints the values of the nodes in sorted order.
    private static void inorderTraversal(TreeNode2 node) {
        if (node == null) {
            return;
        }

        inorderTraversal(node.left);
        System.out.print(node.val + " ");
        inorderTraversal(node.right);
    }
    private static void printTree(TreeNode2 node, int level) {
        if (node == null) {
            return;
        }

        printTree(node.right, level + 1);

        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }

        System.out.println(node.val);

        printTree(node.left, level + 1);
    }

    public static class TreeNode2 {
        int val;
        TreeNode2 left;
        TreeNode2 right;


        TreeNode2() {
        }

        TreeNode2(int val) {
            this.val = val;
        }

        TreeNode2(int val, TreeNode2 left, TreeNode2 right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }
}
