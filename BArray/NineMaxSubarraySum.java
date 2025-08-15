package BArray;

import java.util.*;

public class NineMaxSubarraySum {

  public static void PS(int num[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;

    for (int i = 0; i < num.length; i++) {  // Start from 0 instead of 1
      for (int j = i; j < num.length; j++) {
        currSum = 0;
        System.out.print("Subarray [" + i + "..." + j + "]: ");
        for (int k = i; k <= j; k++) {
          currSum += num[k];
          System.out.print(num[k] + " ");
        }
        if (maxSum < currSum) {
          maxSum = currSum;
        }
        System.out.println(" Sum: " + currSum);
      }
      System.out.println();
    }
    System.out.println("Maximum Subarray Sum: " + maxSum);
  };

  public static void main(String[] args) {
    int num[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
    PS(num);
  }
}