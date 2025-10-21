public class KStringConversion {
  // DP-based solution: Minimum number of changes to convert s1 to s2
  public static int minConversion(String s1, String s2, int k) {
    int n = s1.length();
    int m = s2.length();
    if (n != m) return -1; // Only same length strings

    // dp[i][j]: min changes to convert first i chars of s1 to first j chars of s2
    int[][] dp = new int[n + 1][m + 1];

    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= m; j++) {
        if (i == 0) {
          dp[i][j] = j;
        } else if (j == 0) {
          dp[i][j] = i;
        } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
          dp[i][j] = dp[i - 1][j - 1];
        } else {
          dp[i][j] = 1 + dp[i - 1][j - 1]; // Change operation
        }
      }
    }

    return dp[n][m] <= k ? dp[n][m] : -1;
  }

  public static void main(String[] args) {
    String s1 = "abcde";
    String s2 = "abfde";
    int k = 1;
    int result = minConversion(s1, s2, k);
    if (result != -1) {
      System.out.println("Can convert with " + result + " changes.");
    } else {
      System.out.println("Cannot convert within " + k + " changes.");
    }
  }
}
