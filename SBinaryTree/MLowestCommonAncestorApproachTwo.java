package SBinaryTree;

class TreeNode {
  int val;
  TreeNode left, right;

  TreeNode(int x) {
    val = x;
  }

}

public class MLowestCommonAncestorApproachTwo {
  public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null || root == p || root == q)
      return root;
    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);
    if (left != null && right != null)
      return root;
    return left != null ? left : right;
  }

  public static void main(String[] args) {
    // Example tree
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(5);
    root.right = new TreeNode(1);
    root.left.left = new TreeNode(6);
    root.left.right = new TreeNode(2);
    root.right.left = new TreeNode(0);
    root.right.right = new TreeNode(8);

    TreeNode p = root.left; // Node with value 5
    TreeNode q = root.right; // Node with value 1

    TreeNode lca = lowestCommonAncestor(root, p, q);
    System.out.println("LCA: " + (lca != null ? lca.val : "null"));
  }

}
