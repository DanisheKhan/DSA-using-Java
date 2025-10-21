public class NCountingTrees {
  public static void main(String[] args) {
    int n = 5; // Example: number of nodes
    System.out.println("Number of distinct binary trees with " + n + " nodes: " + countTrees(n));
  }

  // DP function to count number of distinct binary trees
  public static int countTrees(int n) {
    int[] dp = new int[n + 1];
    dp[0] = 1; // Empty tree

    for (int nodes = 1; nodes <= n; nodes++) {
      dp[nodes] = 0;
      for (int left = 0; left < nodes; left++) {
        int right = nodes - 1 - left;
        dp[nodes] += dp[left] * dp[right];
      }
    }
    return dp[n];
  }
}
