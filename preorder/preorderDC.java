public class Solution {
  public class TreeNode {
    public int value;
    public TreeNode left, right;
    public Treenode(value) {
      this.value = value;
      this.left = this.right = null;
    }
  }

  public ArrayList<Integer> preorder(TreeNode root) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    if (root == null) {
      return result;
    }

    ArrayList<Integer> leftPart = preorder(root.left);
    ArrayList<Integer> rightPart = preorder(root.right);

    result.add(root.value);
    result.addAll(leftPart);
    result.addAll(rightPart);
    return result;
  }
}
