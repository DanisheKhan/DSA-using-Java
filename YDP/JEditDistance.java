public class JEditDistance {
  public static void main(String[] args) {
    String s1 = "horse";
    String s2 = "ros";
    
    int result = minDistance(s1, s2);
    System.out.println("Edit distance between '" + s1 + "' and '" + s2 + "': " + result);
  }
  
  public static int minDistance(String word1, String word2) {
    int m = word1.length();
    int n = word2.length();
    
    // dp[i][j] represents min operations to convert word1[0..i-1] to word2[0..j-1]
    int[][] dp = new int[m + 1][n + 1];
    
    // Base cases
    for (int i = 0; i <= m; i++) {
      dp[i][0] = i; // Delete all characters from word1
    }
    for (int j = 0; j <= n; j++) {
      dp[0][j] = j; // Insert all characters to match word2
    }
    
    // Fill the dp table
    for (int i = 1; i <= m; i++) {
      for (int j = 1; j <= n; j++) {
        if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
          dp[i][j] = dp[i - 1][j - 1]; // No operation needed
        } else {
          dp[i][j] = 1 + Math.min(
            dp[i - 1][j],      // Delete
            Math.min(
              dp[i][j - 1],    // Insert
              dp[i - 1][j - 1] // Replace
            )
          );
        }
      }
    }
    
    return dp[m][n];
  }
}
