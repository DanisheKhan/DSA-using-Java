package TBinarySearchTree;

class Node {
  int key;
  Node left, right;

  public Node(int item) {
    key = item;
    left = right = null;
  }
}

public class DDeleteANode {
  Node root;

  DDeleteANode() {
    root = null;
  }

  void insert(int key) {
    root = insertRec(root, key);
  }

  Node insertRec(Node root, int key) {
    if (root == null) {
      root = new Node(key);
      return root;
    }
    if (key < root.key)
      root.left = insertRec(root.left, key);
    else if (key > root.key)
      root.right = insertRec(root.right, key);
    return root;
  }

  void inorder() {
    inorderRec(root);
    System.out.println();
  }

  void inorderRec(Node root) {
    if (root != null) {
      inorderRec(root.left);
      System.out.print(root.key + " ");
      inorderRec(root.right);
    }
  }

  void deleteKey(int key) {
    root = deleteRec(root, key);
  }

  Node deleteRec(Node root, int key) {
    if (root == null)
      return root;

    if (key < root.key)
      root.left = deleteRec(root.left, key);
    else if (key > root.key)
      root.right = deleteRec(root.right, key);
    else {
      // Node with only one child or no child
      if (root.left == null)
        return root.right;
      else if (root.right == null)
        return root.left;

      // Node with two children: Get inorder successor (smallest in right subtree)
      root.key = minValue(root.right);

      // Delete the inorder successor
      root.right = deleteRec(root.right, root.key);
    }
    return root;
  }

  int minValue(Node root) {
    int minv = root.key;
    while (root.left != null) {
      minv = root.left.key;
      root = root.left;
    }
    return minv;
  }

  public static void main(String[] args) {
    DDeleteANode tree = new DDeleteANode();

    /* Let us create following BST
        50
       /     \
      30      70
     /  \    /  \
    20  40  60  80 */

    tree.insert(50);
    tree.insert(30);
    tree.insert(20);
    tree.insert(40);
    tree.insert(70);
    tree.insert(60);
    tree.insert(80);

    System.out.print("Inorder traversal: ");
    tree.inorder();

    System.out.println("Delete 20");
    tree.deleteKey(20);
    System.out.print("Inorder traversal: ");
    tree.inorder();

    System.out.println("Delete 30");
    tree.deleteKey(30);
    System.out.print("Inorder traversal: ");
    tree.inorder();

    System.out.println("Delete 50");
    tree.deleteKey(50);
    System.out.print("Inorder traversal: ");
    tree.inorder();
  }
}
