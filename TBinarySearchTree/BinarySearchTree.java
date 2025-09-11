package TBinarySearchTree;

public class BinarySearchTree {
  // Node class for BST
  static class Node {
    int key;
    Node left, right;

    Node(int key) {
      this.key = key;
      left = right = null;
    }
  }

  Node root;

  public BinarySearchTree() {
    root = null;
  }

  // Insert a new key
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

  // Search for a key in BST
  boolean search(int key) {
    return searchRec(root, key);
  }

  // Helper method for searching
  boolean searchRec(Node root, int key) {
    if (root == null) {
      return false;
    }
    if (root.key == key) {
      return true;
    }
    if (key < root.key) {
      return searchRec(root.left, key);
    } else {
      return searchRec(root.right, key);
    }
  }

  public static void main(String[] args) {
    BinarySearchTree tree = new BinarySearchTree();
    tree.insert(50);
    tree.insert(30);
    tree.insert(70);
    tree.insert(20);
    tree.insert(40);
    tree.insert(60);
    tree.insert(80);

    int keyToFind = 40;
    if (tree.search(keyToFind))
      System.out.println(keyToFind + " found in BST.");
    else
      System.out.println(keyToFind + " not found in BST.");
  }
}