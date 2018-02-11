public class Solution {
  public class TreeNode {
    public int value;
    public TreeNode left, right;
    public TreeNode(int) {
      this.value = int;
      this.left = this.right = null;
    }
  }

  public ArrayList<Integer> inorder(TreeNode root) {
    Stack<Integer> stack = new Stack<Integer>();
    ArrayList<Integer> result = new ArrayList<Integer>();
    if (root == null) {
      return result;
    }

    TreeNode currentNode = root;
    while (currentNode != null || !stack.empty()) {
      while (currentNode != null) {
        stack.add(currentNode);
        currentNode = currentNode.left;
      }
      currentNode = stack.pop();
      result.add(currentNode.value);
      currentNode = currentNode.right;
    }
    return result;
  }
}
