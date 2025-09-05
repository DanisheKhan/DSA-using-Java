package SBinaryTree;

import java.util.*;

public class ABinaryTreeBasic {
  static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  static class BinaryTree {
    static int idx = -1;

    public static Node buildTree(int nodes[]) {
      idx++;
      if (nodes[idx] == -1) {
        return null;
      }
      Node newNode = new Node(nodes[idx]);
      newNode.left = buildTree(nodes);
      newNode.right = buildTree(nodes);
      return newNode;
    }
  }

  // preOrder
  public static void preorder(Node root) {
    if (root == null) {
      return;
    }
    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
  }

  // inorder
  public static void inorder(Node root) {
    if (root == null) {
      return;
    }
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }

  // postorder
  public static void postorder(Node root) {
    if (root == null) {
      return;
    }
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data + " ");
  }

  // LevelOrder
  public static void levelOrder(Node root) {
    if (root == null) {
      return;
    }
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      int levelSize = queue.size();
      for (int i = 0; i < levelSize; i++) {
        Node curr = queue.poll();
        System.out.print(curr.data + " ");
        if (curr.left != null) {
          queue.add(curr.left);
        }
        if (curr.right != null) {
          queue.add(curr.right);
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
    BinaryTree tree = new BinaryTree();
    Node root = BinaryTree.buildTree(nodes);
    // You can add traversal or other operations
    preorder(root);
    System.out.println();

    inorder(root);
    System.out.println();

    postorder(root);
    System.out.println();

    levelOrder(root);
    System.out.println();
  }
}