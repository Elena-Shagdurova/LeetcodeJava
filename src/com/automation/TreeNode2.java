package com.automation;

public class TreeNode2 {
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

    public static void main(String[] args) {
        int[] nums = {-10, -3, 0, 5, 9};

        TreeNode2 root = sortedArrayToBST(nums);

        // Perform any operations or traversals on the constructed tree as needed
        // For example, printing the tree using inorder traversal
        System.out.println("Inorder Traversal:");
        inorderTraversal(root);
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

    private static void inorderTraversal(TreeNode2 node) {
        if (node == null) {
            return;
        }

        inorderTraversal(node.left);
        System.out.print(node.val + " ");
        inorderTraversal(node.right);
    }
}




