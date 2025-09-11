package TBinarySearchTree;

import java.util.*;

class TreeNode {
  int val;
  TreeNode left, right;

  TreeNode(int x) {
    val = x;
  }
}

public class FRootToLeadPaths {
  public static void main(String[] args) {
    // Example tree:
    // 1
    // / \
    // 2 3
    // / \
    // 4 5
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);

    List<List<Integer>> paths = new ArrayList<>();
    rootToLeafPaths(root, new ArrayList<>(), paths);

    for (List<Integer> path : paths) {
      System.out.println(path);
    }
  }

  static void rootToLeafPaths(TreeNode node, List<Integer> current, List<List<Integer>> paths) {
    if (node == null)
      return;
    current.add(node.val);
    if (node.left == null && node.right == null) {
      paths.add(new ArrayList<>(current));
    } else {
      rootToLeafPaths(node.left, current, paths);
      rootToLeafPaths(node.right, current, paths);
    }
    current.remove(current.size() - 1);
  }
}
