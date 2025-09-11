package TBinarySearchTree;

class Node {
  int data;
  Node left, right;

  Node(int data) {
    this.data = data;
  }
}

public class EPrintInRange {
  static void printInRange(Node root, int low, int high) {
    if (root == null)
      return;
    if (root.data > low)
      printInRange(root.left, low, high);
    if (root.data >= low && root.data <= high)
      System.out.print(root.data + " ");
    if (root.data < high)
      printInRange(root.right, low, high);
  }

  public static void main(String[] args) {
    Node root = new Node(10);
    root.left = new Node(5);
    root.right = new Node(15);
    root.left.left = new Node(3);
    root.left.right = new Node(7);
    root.right.left = new Node(12);
    root.right.right = new Node(18);

    int low = 7, high = 15;
    printInRange(root, low, high);
  }

}
