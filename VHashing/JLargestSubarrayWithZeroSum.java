package VHashing;

import java.util.HashMap;

public class JLargestSubarrayWithZeroSum {
  public static int maxLen(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int maxLen = 0;
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];

      if (sum == 0) {
        maxLen = i + 1;
      } else if (map.containsKey(sum)) {
        maxLen = Math.max(maxLen, i - map.get(sum));
      } else {
        map.put(sum, i);
      }
    }
    return maxLen;
  }

  public static void main(String[] args) {
    int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
    System.out.println("Length of the largest subarray with zero sum: " + maxLen(arr));
  }
}
