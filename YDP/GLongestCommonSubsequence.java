public class GLongestCommonSubsequence {
  public static void main(String[] args) {
    String a = "AGGTAB"; // predefined string
    String b = "GXTXAYB"; // predefined string

    String lcs = lcs(a, b);
    System.out.println("Length: " + lcs.length());
    System.out.println("LCS: " + lcs);
  }

  // Returns one LCS using bottom-up DP
  public static String lcs(String a, String b) {
    if (a == null || b == null) return "";
    int n = a.length(), m = b.length();
    int[][] dp = new int[n + 1][m + 1];

    for (int i = 1; i <= n; i++) {
      char ca = a.charAt(i - 1);
      for (int j = 1; j <= m; j++) {
        char cb = b.charAt(j - 1);
        if (ca == cb) dp[i][j] = dp[i - 1][j - 1] + 1;
        else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
      }
    }

    // Reconstruct LCS from dp table
    StringBuilder sb = new StringBuilder(dp[n][m]);
    int i = n, j = m;
    while (i > 0 && j > 0) {
      if (a.charAt(i - 1) == b.charAt(j - 1)) {
        sb.append(a.charAt(i - 1));
        i--;
        j--;
      } else if (dp[i - 1][j] >= dp[i][j - 1]) {
        i--;
      } else {
        j--;
      }
    }
    return sb.reverse().toString();
  }
}
