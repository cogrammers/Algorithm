public class Solution {
  public class TreeNode {
    public int val;
    public TreeNode left, right;
    public TreeNode(value) {
      this.val = value;
      this.left = null;
      this.right = null;
    }
  }
  public List<Integer> preorder(TreeNode root) {
    Stack<TreeNode> stack = new Stack<TreeNode>();
    ArrayList<Integer> preorder = new ArrayList<Integer>();

    if (root == null) {
      return preorder;
    }
    stack.push(root);
    while (!stack.empty()) {
      TreeNode node = stack.pop();
      preorder.add(node.val);
      if (node.right != null) {
        stack.push(node.right);
      }
      if (node.left != null) {
        stack.push(node.left);
      }
    }
    return preorder;
  }
}
