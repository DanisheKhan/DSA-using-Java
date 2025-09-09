package SBinaryTree;

class TreeNode {
  int val;
  TreeNode left, right;
  TreeNode(int val) {
    this.val = val;
  }
}

public class OKthAncestorOfNode {
  // Function to find kth ancestor of given node
  public static int findKthAncestor(TreeNode root, int node, int k) {
    int[] ancestor = new int[]{-1};
    findAncestorUtil(root, node, k, ancestor);
    return ancestor[0];
  }

  private static int findAncestorUtil(TreeNode root, int node, int k, int[] ancestor) {
    if (root == null) return -1;
    if (root.val == node) return 0;

    int leftDist = findAncestorUtil(root.left, node, k, ancestor);
    int rightDist = findAncestorUtil(root.right, node, k, ancestor);

    int currDist = Math.max(leftDist, rightDist);
    if (currDist != -1) {
      if (currDist + 1 == k) ancestor[0] = root.val;
      return currDist + 1;
    }
    return -1;
  }

  public static void main(String[] args) {
    // Example tree:
    //        1
    //       / \
    //      2   3
    //     / \
    //    4   5
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);

    int node = 5, k = 2;
    int ancestor = findKthAncestor(root, node, k);
    System.out.println("The " + k + "th ancestor of node " + node + " is: " + ancestor);
  }
}
