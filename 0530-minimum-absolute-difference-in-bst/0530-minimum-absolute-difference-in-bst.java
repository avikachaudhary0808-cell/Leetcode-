class Solution {

    int minDiff = Integer.MAX_VALUE;
    Integer prev = null;

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }

    private void inorder(TreeNode root) {

        if (root == null) {
            return;
        }

        // Left subtree
        inorder(root.left);

        // Current node
        if (prev != null) {
            minDiff = Math.min(minDiff, root.val - prev);
        }

        prev = root.val;

        // Right subtree
        inorder(root.right);
    }
}