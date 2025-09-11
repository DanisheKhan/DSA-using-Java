package TBinarySearchTree;

class Node {
  int data;
  Node left, right;
  Node(int data) {
    this.data = data;
    left = right = null;
  }
}

public class ABuildBST {
  Node root;

  // Insert a node into BST
  Node insert(Node root, int data) {
    if (root == null) {
      root = new Node(data);
      return root;
    }
    if (data < root.data)
      root.left = insert(root.left, data);
    else if (data > root.data)
      root.right = insert(root.right, data);
    return root;
  }

  // Inorder traversal
  void inorder(Node root) {
    if (root != null) {
      inorder(root.left);
      System.out.print(root.data + " ");
      inorder(root.right);
    }
  }

  public static void main(String[] args) {
    ABuildBST tree = new ABuildBST();
    int[] values = {50, 30, 20, 40, 70, 60, 80};
    for (int val : values) {
      tree.root = tree.insert(tree.root, val);
    }
    tree.inorder(tree.root); // Output: 20 30 40 50 60 70 80
  }
}
