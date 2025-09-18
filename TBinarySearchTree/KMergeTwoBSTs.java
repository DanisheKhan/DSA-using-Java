package TBinarySearchTree;

import java.util.*;

class TreeNode {
  int val;
  TreeNode left, right;

  TreeNode(int x) {
    val = x;
  }
}

public class KMergeTwoBSTs {

  // Inorder traversal to get sorted elements
  private static void inorder(TreeNode root, List<Integer> list) {
    if (root == null)
      return;
    inorder(root.left, list);
    list.add(root.val);
    inorder(root.right, list);
  }

  // Merge two sorted lists
  private static List<Integer> merge(List<Integer> l1, List<Integer> l2) {
    List<Integer> merged = new ArrayList<>();
    int i = 0, j = 0;
    while (i < l1.size() && j < l2.size()) {
      if (l1.get(i) < l2.get(j))
        merged.add(l1.get(i++));
      else
        merged.add(l2.get(j++));
    }
    while (i < l1.size())
      merged.add(l1.get(i++));
    while (j < l2.size())
      merged.add(l2.get(j++));
    return merged;
  }

  // Helper to insert into BST
  private static TreeNode insert(TreeNode root, int val) {
    if (root == null)
      return new TreeNode(val);
    if (val < root.val)
      root.left = insert(root.left, val);
    else
      root.right = insert(root.right, val);
    return root;
  }

  public static void main(String[] args) {
    // Example BST 1
    TreeNode root1 = null;
    root1 = insert(root1, 3);
    root1 = insert(root1, 1);
    root1 = insert(root1, 5);

    // Example BST 2
    TreeNode root2 = null;
    root2 = insert(root2, 4);
    root2 = insert(root2, 2);
    root2 = insert(root2, 6);

    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    inorder(root1, list1);
    inorder(root2, list2);

    List<Integer> merged = merge(list1, list2);

    System.out.println("Merged Inorder Traversal: " + merged);
  }
}