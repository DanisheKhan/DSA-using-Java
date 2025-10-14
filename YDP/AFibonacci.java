package YDP;

public class AFibonacci {
  // Function to compute nth Fibonacci number using DP
  public static int fibonacci(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    int[] dp = new int[n + 1];
    dp[0] = 0;
    dp[1] = 1;
    for (int i = 2; i <= n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
  }

  public static int fibonacciTabulation(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    int[] table = new int[n + 1];
    table[0] = 0;
    table[1] = 1;
    for (int i = 2; i <= n; i++) {
      table[i] = table[i - 1] + table[i - 2];
    }
    return table[n];
  }

  public static void main(String[] args) {
    int n = 10; // Example: Find the 10th Fibonacci number
    System.out.println("Fibonacci number at position " + n + " is " + fibonacci(n));
  }
}
