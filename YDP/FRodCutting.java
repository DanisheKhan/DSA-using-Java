public class FRodCutting {
  public static void main(String[] args) {
    int[] prices = {1, 5, 8, 9, 10, 17, 17, 20};
    int[] costs = {0, 2, 3, 4, 5, 6, 7, 8}; // Example costs for each length
    int rodLength = 8;
    
    int maxProfit = rodCutting(prices, costs, rodLength);
    System.out.println("Maximum profit: " + maxProfit);
  }
  
  public static int rodCutting(int[] prices, int[] costs, int n) {
    int[] dp = new int[n + 1];
    
    for (int i = 1; i <= n; i++) {
      int maxVal = Integer.MIN_VALUE;
      for (int j = 0; j < i; j++) {
        if (j < prices.length && i - j - 1 < costs.length) {
          maxVal = Math.max(maxVal, prices[j] - costs[i - j - 1] + dp[i - j - 1]);
        }
      }
      dp[i] = maxVal;
    }
    
    return dp[n];
  }
}
