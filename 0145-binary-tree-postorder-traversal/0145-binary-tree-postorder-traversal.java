class Solution {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        postorder(root, result);

        return result;
    }

    private void postorder(TreeNode node, List<Integer> result) {

        if (node == null) {
            return;
        }

        // 1. Left
        postorder(node.left, result);

        // 2. Right
        postorder(node.right, result);

        // 3. Root
        result.add(node.val);
    }
}