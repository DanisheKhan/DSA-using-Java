public class EUnboundedKnapsack {
  // Function to solve Unbounded Knapsack problem
  public static int unboundedKnapsack(int W, int[] wt, int[] val, int n) {
    int[] dp = new int[W + 1];
    for (int i = 0; i <= W; i++) {
      for (int j = 0; j < n; j++) {
        if (wt[j] <= i) {
          dp[i] = Math.max(dp[i], dp[i - wt[j]] + val[j]);
        }
      }
    }
    return dp[W];
  }

  public static void main(String[] args) {
    int W = 100;
    int[] val = {10, 30, 20};
    int[] wt = {5, 10, 15};
    int n = val.length;
    System.out.println("Maximum value: " + unboundedKnapsack(W, wt, val, n));
  }
}
