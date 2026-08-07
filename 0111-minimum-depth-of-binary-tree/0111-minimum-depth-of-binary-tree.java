class Solution {
    public int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        // If left subtree doesn't exist
        if (root.left == null) {
            return minDepth(root.right) + 1;
        }

        // If right subtree doesn't exist
        if (root.right == null) {
            return minDepth(root.left) + 1;
        }

        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}