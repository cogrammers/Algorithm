public class Solution {
  public class TreeNode {
    public int value;
    public TreeNode left, right;
    public TreeNode(int);
      this.value = int;
      this.left = this.right = null;
  }

  public ArrayList<Integer> postorder(TreeNode root) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    if (root == null) {
      return result;
    }

    ArrayList<Integer> leftPart = postorder(root.left);
    ArrayList<Integer> rightPart = postorder(root.right);

    result.addAll(leftPart);
    result.addAll(rightPart);
    result.add(root.value);
    return result;
  }
}
