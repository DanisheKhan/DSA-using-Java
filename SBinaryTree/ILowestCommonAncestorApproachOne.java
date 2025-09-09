package SBinaryTree;

import java.util.*;

class TreeNode {
  int val;
  TreeNode left, right;

  TreeNode(int x) {
    val = x;
  }
}

public class ILowestCommonAncestorApproachOne {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(5);
    root.right = new TreeNode(1);
    root.left.left = new TreeNode(6);
    root.left.right = new TreeNode(2);
    root.right.left = new TreeNode(0);
    root.right.right = new TreeNode(8);

    // Using path-based approach
    TreeNode lca1 = lca(root, 5, 1);
    System.out.println("LCA (path approach): " + (lca1 != null ? lca1.val : "null"));

  }

  // Helper method to find path from root to target node
  public static boolean getPath(TreeNode root, int n, ArrayList<TreeNode> path) {
    if (root == null)
      return false;

    path.add(root);

    if (root.val == n)
      return true;

    boolean foundLeft = getPath(root.left, n, path);
    boolean foundRight = getPath(root.right, n, path);

    if (foundLeft || foundRight) {
      return true;
    }

    path.remove(path.size() - 1);
    return false;
  }

  // LCA using path approach
  public static TreeNode lca(TreeNode root, int n1, int n2) {
    ArrayList<TreeNode> path1 = new ArrayList<>();
    ArrayList<TreeNode> path2 = new ArrayList<>();

    getPath(root, n1, path1);
    getPath(root, n2, path2);

    // Find last common ancestor
    int i = 0;
    for (; i < path1.size() && i < path2.size(); i++) {
      if (path1.get(i) != path2.get(i)) {
        break;
      }
    }

    // Last equal node -> i-1th
    TreeNode lca = path1.get(i - 1);
    return lca;
  }

}