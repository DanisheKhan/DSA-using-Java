package CBasicSortingAlgorithm;

import java.util.Arrays;
import java.util.Collections;


public class FourInbuiltAlgorithmJava {

  public static void main(String[] args) {
    Integer arr[] = { 64, 34, 25, 12, 22, 11, 90 };
    // Arrays.sort(arr);
    Arrays.sort(arr, Collections.reverseOrder());
    System.out.println(Arrays.toString(arr));

  }
}
