package RGreedyAlgorithm;

import java.util.Arrays;

public class DMaxLengthChainOfPairs {
  public static void main(String[] args) {
    int[][] pairs = { { 5, 24 }, { 15, 25 }, { 27, 40 }, { 50, 60 } };
    System.out.println(maxChainLength(pairs));
  }

  public static int maxChainLength(int[][] pairs) {
    Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
    int count = 1;
    int lastEnd = pairs[0][1];
    for (int i = 1; i < pairs.length; i++) {
      if (pairs[i][0] > lastEnd) {
        count++;
        lastEnd = pairs[i][1];
      }
    }
    return count;
  }
}
