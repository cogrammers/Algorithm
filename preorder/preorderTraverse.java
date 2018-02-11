public class Solution {
  public class TreeNode {
    public int value;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int) {
      this.value = int;
      this.left = this.right = null;
    }
  }

  public ArrayList<Integer> preorder(TreeNode root) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    if (root == null) {
      return result;
    }
    traverse(root, resul);
    return result;
  }
  private void traverse(TreeNode root, ArrayList<Integer> result) {
    if (root == null) {
      return;
    }
    result.add(node.value);
    traverse(root.left, result);
    traverse(root.right, result);
  }
}
