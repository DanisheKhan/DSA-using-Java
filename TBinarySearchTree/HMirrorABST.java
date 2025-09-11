package TBinarySearchTree;

class Node {
  int data;
  Node left, right;
  Node(int data) {
    this.data = data;
    left = right = null;
  }
}

public class HMirrorABST {
  // Insert a node into BST
  static Node insert(Node root, int data) {
    if (root == null) return new Node(data);
    if (data < root.data) root.left = insert(root.left, data);
    else root.right = insert(root.right, data);
    return root;
  }

  // Mirror the BST
  static Node mirror(Node root) {
    if (root == null) return null;
    Node temp = root.left;
    root.left = mirror(root.right);
    root.right = mirror(temp);
    return root;
  }

  // Inorder traversal
  static void inorder(Node root) {
    if (root == null) return;
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }

  public static void main(String[] args) {
    Node root = null;
    int[] arr = {4, 2, 7, 1, 3, 6, 9};
    for (int val : arr) root = insert(root, val);

    System.out.print("Original BST (Inorder): ");
    inorder(root);
    System.out.println();

    root = mirror(root);

    System.out.print("Mirrored BST (Inorder): ");
    inorder(root);
    System.out.println();
  }
}
