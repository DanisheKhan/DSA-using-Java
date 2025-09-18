package TBinarySearchTree;

class Node {
  int data;
  Node left, right;
  Node(int d) {
    data = d;
    left = right = null;
  }
}

class BSTInfo {
  int size;      // Size of current subtree
  int min;       // Min value in subtree
  int max;       // Max value in subtree
  int maxSize;   // Size of largest BST
  boolean isBST; // Is current subtree BST

  BSTInfo(int size, int min, int max, int maxSize, boolean isBST) {
    this.size = size;
    this.min = min;
    this.max = max;
    this.maxSize = maxSize;
    this.isBST = isBST;
  }
}

public class JSizeOfLargestBSTInBT {
  public static void main(String[] args) {
    Node root = new Node(50);
    root.left = new Node(30);
    root.right = new Node(60);
    root.left.left = new Node(5);
    root.left.right = new Node(20);
    root.right.left = new Node(45);
    root.right.right = new Node(70);
    root.right.right.left = new Node(65);
    root.right.right.right = new Node(80);

    System.out.println("Size of largest BST is: " + largestBST(root));
  }

  static int largestBST(Node root) {
    return largestBSTUtil(root).maxSize;
  }

  static BSTInfo largestBSTUtil(Node node) {
    if (node == null)
      return new BSTInfo(0, Integer.MAX_VALUE, Integer.MIN_VALUE, 0, true);

    if (node.left == null && node.right == null)
      return new BSTInfo(1, node.data, node.data, 1, true);

    BSTInfo left = largestBSTUtil(node.left);
    BSTInfo right = largestBSTUtil(node.right);

    BSTInfo curr = new BSTInfo(0, 0, 0, 0, false);

    curr.size = 1 + left.size + right.size;

    if (left.isBST && right.isBST && node.data > left.max && node.data < right.min) {
      curr.min = Math.min(left.min, node.data);
      curr.max = Math.max(right.max, node.data);
      curr.maxSize = curr.size;
      curr.isBST = true;
      return curr;
    }

    curr.maxSize = Math.max(left.maxSize, right.maxSize);
    curr.isBST = false;
    return curr;
  }
}
