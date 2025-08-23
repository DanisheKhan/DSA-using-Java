package MArrayList;

import java.util.*;

public class FPairSumOne {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6 };
    int target = 7;
    List<int[]> pairs = sortedPairSum(arr, target);
    for (int[] pair : pairs) {
      System.out.println(pair[0] + ", " + pair[1]);
    }
  }

  // Finds all pairs in sorted array that sum to target
  public static List<int[]> sortedPairSum(int[] arr, int target) {
    List<int[]> result = new ArrayList<>();
    int left = 0, right = arr.length - 1;
    while (left < right) {
      int sum = arr[left] + arr[right];
      if (sum == target) {
        result.add(new int[] { arr[left], arr[right] });
        left++;
        right--;
      } else if (sum < target) {
        left++;
      } else {
        right--;
      }
    }
    return result;
  }
}
