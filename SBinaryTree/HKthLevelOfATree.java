package SBinaryTree;
class Node {
  int data;
  Node left, right;
  Node(int data) {
    this.data = data;
    left = right = null;
  }
}

public class HKthLevelOfATree {
  // Recursive approach (existing)
  public static void printKthLevel(Node root, int k) {
    if (root == null) return;
    if (k == 1) {
      System.out.print(root.data + " ");
      return;
    }
    printKthLevel(root.left, k - 1);
    printKthLevel(root.right, k - 1);
  }

  // Iterative approach using level order traversal
  public static void KLevel(Node root, int level, int k) {
    if (root == null) return;
    
    if (level == k) {
      System.out.print(root.data + " ");
      return;
    }
    
    KLevel(root.left, level + 1, k);
    KLevel(root.right, level + 1, k);
  }

  public static void main(String[] args) {

    System.out.println("Tree visualization:");
    System.out.println("        1");
    System.out.println("      /   \\");
    System.out.println("     2     3");
    System.out.println("    / \\");
    System.out.println("   4   5");
    System.out.println();
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);

    int k = 3;
    System.out.print("Nodes at level " + k + " (recursive): ");
    printKthLevel(root, k);
    System.out.println();
  
  }
}