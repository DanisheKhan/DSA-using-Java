package SBinaryTree;

class Node {
  int data;
  Node left, right;

  Node(int data) {
    this.data = data;
    left = right = null;
  }

  static int height(Node node) {
    if (node == null)
      return 0;
    int leftHeight = height(node.left);
    int rightHeight = height(node.right);
    return Math.max(leftHeight, rightHeight) + 1;
  }

  public class BHeightOfTree {
    public static void main(String[] args) {
      // Example tree:
      // 1
      // / \
      // 2 3
      // / \
      // 4 5
      Node root = new Node(1);
      root.left = new Node(2);
      root.right = new Node(3);
      root.left.left = new Node(4);
      root.left.right = new Node(5);

      System.out.println("Height of tree: " + height(root));
    }

  }
}