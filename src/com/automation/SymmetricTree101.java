package com.automation;

public class SymmetricTree101 {
    public static void main(String[] args) {
        // Example tree: symmetric
        //        1
        //       / \
        //      2   2
        //     / \ / \
        //    3  4 4  3

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        SymmetricTree symmetricTree = new SymmetricTree();
        System.out.println(symmetricTree.isSymmetric(root));  // Output: true

        // Example tree: asymmetric
        //        1
        //       / \
        //      2   2
        //       \   \
        //       3    3

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(3);

        System.out.println(symmetricTree.isSymmetric(root));  // Output: false
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

    }

    public static class SymmetricTree {
        public boolean isSymmetric(TreeNode root) {
            if (root == null) {
                return true;
            }
            return checkSymmetry(root.left, root.right);
        }

        private boolean checkSymmetry(TreeNode left, TreeNode right) {
            if (left == null && right == null) {
                return true;
            }
            if (left == null || right == null) {
                return false;
            }
            if (left.val != right.val) {
                return false;
            }
            return checkSymmetry(left.left, right.right) && checkSymmetry(left.right, right.left);
        }
    }
}
