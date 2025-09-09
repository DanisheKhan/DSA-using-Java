package SBinaryTree;

class Node {
  int data;
  Node left, right;

  Node(int data) {
    this.data = data;
    left = right = null;
  }
}

public class PTransformToSumTree {
  // Transform to sum tree
  static int toSumTree(Node node) {
    if (node == null)
      return 0;
    int old_val = node.data;
    node.data = toSumTree(node.left) + toSumTree(node.right);
    return node.data + old_val;
  }

  // Inorder traversal
  static void inorder(Node node) {
    if (node == null)
      return;
    inorder(node.left);
    System.out.print(node.data + " ");
    inorder(node.right);
  }

  public static void main(String[] args) {
    Node root = new Node(10);
    root.left = new Node(-2);
    root.right = new Node(6);
    root.left.left = new Node(8);
    root.left.right = new Node(-4);
    root.right.left = new Node(7);
    root.right.right = new Node(5);

    toSumTree(root);

    inorder(root); // Output: 0 4 0 20 0 12 0
  }
}
