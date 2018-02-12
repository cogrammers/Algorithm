public class Solution {
    private class ResultType {
        public int sum;
        public int size;
        public ResultType(int sum, int size) {
            this.sum = sum;
            this.size = size;
        }
    }

    private TreeNode subtreeNode = null;
    private ResultType subtree = null;

    public TreeNode findSubtree2(TreeNode root) {
        helper(root);
        return subtreeNode;
    }

    private ResultType helper(TreeNode root) {
        if (root == null) {
            return new ResultType(0, 0);
        }
        ResultType left = helper(root.left);
        ResultType right = helper(root.right);
        ResultType result = new ResultType(
            left.sum + right.sum + root.val,
            left.size + right.size + 1
        );

        if (subtreeNode == null || subtree.sum * result.size < result.sum * subtree.size) {
            subtreeNode = root;
            subtree = result;
        }
        return result;
    }
}
