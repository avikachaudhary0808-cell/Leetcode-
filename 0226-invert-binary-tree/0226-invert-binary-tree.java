class Solution {
    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        // Left aur right ko swap karo
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Subtrees ko invert karo
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}