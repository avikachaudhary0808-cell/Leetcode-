class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null) {
            return false;
        }

        // Current node ki value subtract karo
        targetSum -= root.val;

        // Leaf node hai
        if (root.left == null && root.right == null) {
            return targetSum == 0;
        }

        // Left ya right kisi bhi path ka sum match kare
        return hasPathSum(root.left, targetSum)
                || hasPathSum(root.right, targetSum);
    }
}