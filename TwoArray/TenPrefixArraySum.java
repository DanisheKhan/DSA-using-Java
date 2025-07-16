package TwoArray;

public class TenPrefixArraySum {

  public static int maxSubarraySum(int[] arr) {
    if (arr == null || arr.length == 0) {
      return 0;
    }

    int n = arr.length;
    int[] prefixSum = new int[n];

    // Calculate prefix sum array
    prefixSum[0] = arr[0];
    for (int i = 1; i < n; i++) {
      prefixSum[i] = prefixSum[i - 1] + arr[i];
    }

    // Initialize maxSum with the first element
    int maxSum = arr[0];
    // Initialize minPrefix with 0 (for empty subarray before first element)
    int minPrefix = 0;

    // Start from index 0 to find max subarray sum
    for (int i = 0; i < n; i++) {
      // Current subarray sum is prefixSum[i] - minPrefix
      maxSum = Math.max(maxSum, prefixSum[i] - minPrefix);
      // Update minPrefix for next iteration
      if (i < n - 1) {
        minPrefix = Math.min(minPrefix, prefixSum[i]);
      }
    }

    return maxSum;
  }

  public static void main(String[] args) {
    int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    System.out.println("Maximum subarray sum: " + maxSubarraySum(arr));
  }
}
