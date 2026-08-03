class Solution {
    public boolean isSymmetric(TreeNode root) {
        return checkMirror(root.left, root.right);
    }

    private boolean checkMirror(TreeNode left, TreeNode right) {

        // Dono null
        if (left == null && right == null) {
            return true;
        }

        // Ek null, ek non-null
        if (left == null || right == null) {
            return false;
        }

        // Values different
        if (left.val != right.val) {
            return false;
        }

        // Mirror comparison:
        // left ka LEFT  ↔ right ka RIGHT
        // left ka RIGHT ↔ right ka LEFT
        return checkMirror(left.left, right.right)
                && checkMirror(left.right, right.left);
    }
}