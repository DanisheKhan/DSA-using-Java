package SBinaryTree;

class TreeNode {
  int val;
  TreeNode left, right;
  TreeNode(int val) {
    this.val = val;
  }
}

public class EDiameterOfATree {
  // Helper class to store height and diameter
  static class TreeInfo {
    int height;
    int diameter;
    TreeInfo(int height, int diameter) {
      this.height = height;
      this.diameter = diameter;
    }
  }

  // Function to compute diameter
  public static TreeInfo diameter(TreeNode root) {
    if (root == null) return new TreeInfo(0, 0);

    TreeInfo left = diameter(root.left);
    TreeInfo right = diameter(root.right);

    int height = Math.max(left.height, right.height) + 1;
    int rootDiameter = left.height + right.height;
    int diameter = Math.max(rootDiameter, Math.max(left.diameter, right.diameter));

    return new TreeInfo(height, diameter);
  }

  public static void main(String[] args) {
    // Example tree:
    //      1
    //     / \
    //    2   3
    //   / \
    //  4   5
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);

    TreeInfo info = diameter(root);
    System.out.println("Diameter of the tree: " + info.diameter);
  }
}
