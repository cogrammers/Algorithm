import java.util.*;

class solution {
  public static boolean bfs(Node root, int target){
    Queue<Node> q = new LinkedList<Node>();
    Node current = root;
    while (current != null) {
      System.out.format("Currently searching %d\n", current.val);
      if (current.val == target){
        return true;
      }
      if (current.left != null) {
        q.add(current.left);
      }
      if (current.right != null) {
        q.add(current.right);
      }
      current = q.poll();
    }
    return true;
  }

  public static Node buildTree() {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.right = new Node(6);
    root.left.left.left = new Node(3);
    root.left.left.right = new Node(8);
    root.left.right.left = new Node(9);
    root.left.right.right = new Node(10);

    return root;
  }

  public static void main(String args[]){
    Node root = buildTree();
    boolean out = bfs(root, 3);
    
    if (out) {
      System.out.println("We found the value!");
    } else {
      System.out.println("The value wasn't there...");
    }
  }
}

class Node {
  Node left, right;
  int val;
  public Node(int inVal){
    left = null;
    right = null;
    val = inVal;
  }
}
