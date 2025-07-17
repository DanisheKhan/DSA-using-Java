package ThreeBasicSortingAlgorithm;

public class TwoSelectionSort {

  public static void SS(int arr[]) {

    for (int i = 0; i < arr.length - 1; i++) {
      int minPos = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[minPos] > arr[j]) {
          minPos = j;
        }
      }
      int temp = arr[minPos];
      arr[minPos] = arr[i];
      arr[i] = temp;

    }
  }

  public static void main(String[] args) {
    int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
    System.out.println("Original array:");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();

    SS(arr);

    System.out.println("Sorted array:");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}

// Selection Sort Algorithm:
// 1. Find the minimum element in the unsorted portion of the array
// 2. Swap it with the first element of the unsorted portion
// 3. Move the boundary of the sorted portion one position to the right
// 4. Repeat until the entire array is sorted
// Time Complexity: O(n²), Space Complexity: O(1)