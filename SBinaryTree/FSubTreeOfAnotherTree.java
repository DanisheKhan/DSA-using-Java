package SBinaryTree;

class TreeNode {
  int val;
  TreeNode left, right;

  TreeNode(int x) {
    val = x;
  }
}

public class FSubTreeOfAnotherTree {
  public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
    if (root == null)
      return false;
    if (isSameTree(root, subRoot))
      return true;
    return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
  }

  private static boolean isSameTree(TreeNode s, TreeNode t) {
    if (s == null && t == null)
      return true;
    if (s == null || t == null)
      return false;
    if (s.val != t.val)
      return false;
    return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
  }

  public static void main(String[] args) {
    // Example usage
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(4);
    root.right = new TreeNode(5);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(2);

    TreeNode subRoot = new TreeNode(4);
    subRoot.left = new TreeNode(1);
    subRoot.right = new TreeNode(2);

    System.out.println(isSubtree(root, subRoot)); // Output: true
  }

}
