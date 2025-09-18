package TBinarySearchTree;

import java.util.ArrayList;
import java.util.Arrays;

class TreeNode {
  int val;
  TreeNode left, right;

  TreeNode(int x) {
    val = x;
  }
}

public class ISortedArrayToBalancedBST {
  public static void main(String[] args) {
    ArrayList<Integer> sortedList = new ArrayList<>(Arrays.asList(-10, -3, 0, 5, 9));
    TreeNode root = sortedListToBST(sortedList, 0, sortedList.size() - 1);
    inorderPrint(root);
  }

  public static TreeNode sortedListToBST(ArrayList<Integer> list, int left, int right) {
    if (left > right)
      return null;
    int mid = left + (right - left) / 2;
    TreeNode node = new TreeNode(list.get(mid));
    node.left = sortedListToBST(list, left, mid - 1);
    node.right = sortedListToBST(list, mid + 1, right);
    return node;
  }

  private static void inorderPrint(TreeNode root) {
    if (root == null)
      return;
    inorderPrint(root.left);
    System.out.print(root.val + " ");
    inorderPrint(root.right);
  }
}
