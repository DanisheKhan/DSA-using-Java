public class CZeroOneKnapsack {

  // Helper function for memoization
  static int knapsackUtil(int[] wt, int[] val, int W, int n, int[][] memo) {
    if (n == 0 || W == 0)
      return 0;
    if (memo[n][W] != -1)
      return memo[n][W];
    if (wt[n - 1] <= W) {
      memo[n][W] = Math.max(
        val[n - 1] + knapsackUtil(wt, val, W - wt[n - 1], n - 1, memo),
        knapsackUtil(wt, val, W, n - 1, memo)
      );
    } else {
      memo[n][W] = knapsackUtil(wt, val, W, n - 1, memo);
    }
    return memo[n][W];
  }

  static int knapsack(int[] wt, int[] val, int W) {
    int n = wt.length;
    int[][] memo = new int[n + 1][W + 1];
    for (int i = 0; i <= n; i++)
      for (int w = 0; w <= W; w++)
        memo[i][w] = -1;
    return knapsackUtil(wt, val, W, n, memo);
  }

  public static void main(String[] args) {
    int[] wt = { 1, 3, 4, 5 };
    int[] val = { 1, 4, 5, 7 };
    int W = 7;
    System.out.println("Maximum value in knapsack = " + knapsack(wt, val, W));
  }
}