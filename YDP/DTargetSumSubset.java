public class DTargetSumSubset {
  public static void main(String[] args) {
    int[] arr = {2, 3, 7, 8, 10}; // Example array
    int target = 11; // Example target

    System.out.println(hasTargetSumSubset(arr, target));
  }

  public static boolean hasTargetSumSubset(int[] arr, int target) {
    int n = arr.length;
    boolean[][] dp = new boolean[n + 1][target + 1];
    for(int i = 0; i <= n; i++) {
      dp[i][0] = true;
    }

    for(int i = 1; i <= n; i++) {
      for(int j = 1; j <= target; j++) {
        if(dp[i-1][j]) {
          dp[i][j] = true;
        } else if(j >= arr[i-1]) {
          dp[i][j] = dp[i-1][j-arr[i-1]];
        }
      }
    }
    return dp[n][target];
  }
}
