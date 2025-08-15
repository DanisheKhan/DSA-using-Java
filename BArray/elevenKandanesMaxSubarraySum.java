package BArray;

import java.util.*;

public class elevenKandanesMaxSubarraySum {

  public static void Kadanes(int numbers[]) {
    int ms = Integer.MIN_VALUE; // maxSum - stores the maximum subarray sum found
    int cs = 0; // currentSum - stores the sum ending at current position

    for (int i = 0; i < numbers.length; i++) {
      cs = cs + numbers[i];

      // If current sum becomes negative, reset it to 0
      if (cs < 0) {
        cs = 0;
      }

      // Update maximum sum if current sum is greater
      ms = Math.max(ms, cs);
    }

    System.out.println("Maximum subarray sum is: " + ms);
  }

  public static void main(String[] args) {
    int[] numbers = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    Kadanes(numbers);
  }
}