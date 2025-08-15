package CBasicSortingAlgorithm;

public class OneBubbleSort {

  
  public static void BS(int arr[]) {
    for (int turn = 0; turn < arr.length - 1; turn++) {
      for (int j = 0; j < arr.length - 1 - turn; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int arr[] = { 1, 4, 3, 5, 2 };
    BS(arr);
    printArr(arr);
  }

}

// Bubble Sort: A simple sorting algorithm that repeatedly steps through the
// list,
// compares adjacent elements and swaps them if they are in the wrong order.
// The pass through the list is repeated until the list is sorted.
// Time Complexity: O(n²), Space Complexity: O(1)
