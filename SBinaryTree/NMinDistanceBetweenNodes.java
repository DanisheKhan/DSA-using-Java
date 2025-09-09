package SBinaryTree;

class Node {
  int data;
  Node left, right;

  Node(int value) {
    data = value;
    left = right = null;
  }
}

public class NMinDistanceBetweenNodes {

  // Find LCA (Lowest Common Ancestor)
  static Node findLCA(Node root, int n1, int n2) {
    if (root == null)
      return null;
    if (root.data == n1 || root.data == n2)
      return root;
    Node left = findLCA(root.left, n1, n2);
    Node right = findLCA(root.right, n1, n2);
    if (left != null && right != null)
      return root;
    return (left != null) ? left : right;
  }

  // Find level (distance) from root to given node
  static int findLevel(Node root, int key, int level) {
    if (root == null)
      return -1;
    if (root.data == key)
      return level;
    int left = findLevel(root.left, key, level + 1);
    if (left != -1)
      return left;
    return findLevel(root.right, key, level + 1);
  }

  // Find minimum distance between two nodes
  static int findDist(Node root, int n1, int n2) {
    Node lca = findLCA(root, n1, n2);
    int d1 = findLevel(lca, n1, 0);
    int d2 = findLevel(lca, n2, 0);
    return d1 + d2;
  }

  public static void main(String[] args) {
    /*
     * 1 / \ 2 3 / \ 4 5
     */
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);

    int n1 = 4, n2 = 5;
    System.out.println("Minimum distance between " + n1 + " and " + n2 + " is: " + findDist(root, n1, n2));
  }
}
