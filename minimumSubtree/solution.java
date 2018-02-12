public class Solution {
    private int subtreeSum = Integer.MAX_VALUE;
    private TreeNode subtree = null;

    public TreeNode findSubtree(TreeNode root) {
        helper(root);
        return subtree;
    }

    private int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = helper(root.left);
        int right = helper(root.right);
        int sum = left + right + root.val;
        if (subtreeSum > sum) {
            subtreeSum = sum;
            subtree = root;
        }
        return sum;
    }
}
