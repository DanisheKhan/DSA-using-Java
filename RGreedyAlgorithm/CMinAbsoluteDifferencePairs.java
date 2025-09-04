package RGreedyAlgorithm;

import java.util.Arrays;

public class CMinAbsoluteDifferencePairs {
  public static void main(String[] args) {
    int[] A = { 1, 3, 5, 9 };
    int[] B = { 8, 6, 4, 2 };
    int n = A.length;

    Arrays.sort(A);
    Arrays.sort(B);

    int minSum = 0;
    for (int i = 0; i < n; i++) {
      minSum += Math.abs(A[i] - B[i]);
    }

    System.out.println("Minimum sum of absolute differences: " + minSum);
  }
}
