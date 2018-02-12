public class Solution {
    private class ResultType {
        boolean is_bst;
        int maxValue, minValue;

        ResultType(boolean is_bst, int maxValue, int minValue) {
            this.is_bst = is_bst;
            this.maxValue = maxValue;
            this.minValue = minValue;
        }
    }
    public boolean isValidBST(TreeNode root) {
        ResultType r = helper(root);
        return r.is_bst;
    }

    private ResultType helper(TreeNode root) {
        if (root == null) {
            return new ResultType(true, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }

        ResultType left = helper(root.left);
        ResultType right = helper(root.right);

        if (!left.is_bst || !right.is_bst) {
            return new ResultType(false, 0, 0);
        }
        if (root.left != null && left.maxValue >= root.val || root.right !=null && right.minValue <= root.val) {
            return new ResultType(false, 0, 0);
        }

        return new ResultType(true,
                              Math.max(root.val, right.maxValue),
                              Math.min(root.val, left.minValue));
    }
}
