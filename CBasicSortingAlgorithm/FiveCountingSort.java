package CBasicSortingAlgorithm;

import java.util.*;

public class FiveCountingSort {

  public static void CS(int arr[]) {
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      largest = Math.max(largest, arr[i]);
    }

    int count[] = new int[largest + 1];
    for (int i = 0; i < arr.length; i++) {
      count[arr[i]]++;
    }

    int j = 0;
    for (int i = 0; i < count.length; i++) {
      while (count[i] > 0) {
        arr[j] = i;
        j++;
        count[i]--;
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = {4, 1, 3, 9, 7};
    System.out.println("Original array: " + Arrays.toString(arr));
    CS(arr);
    System.out.println("Sorted array: " + Arrays.toString(arr));
  }
}
