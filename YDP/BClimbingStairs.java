package YDP;
public class BClimbingStairs {

  public static void main(String[] args) {
    int n = 5; // Example: number of stairs
    System.out.println("Ways to climb " + n + " stairs: " + climbStairs(n));
  }

  // Dynamic Programming approach
  public static int climbStairs(int n) {
    if (n <= 2) return n;
    int[] dp = new int[n + 1];
    dp[1] = 1;
    dp[2] = 2;
    for (int i = 3; i <= n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
  }
}