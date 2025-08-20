package LBacktracking;

public class ABacktrackingArray {
  public static void changeArr(int[] arr, int i, int val) {
    // Base Case
    if (i == arr.length) {
      printArray(arr);
      return;
    }

    // Recursion
    arr[i] = val;
    changeArr(arr, i + 1, val + 1);

    // BackTracking
    arr[i] = arr[i] - 2;
  }

  public static void printArray(int[] arr) {
    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] arr = new int[5];
    changeArr(arr, 0, 1);
    printArray(arr);
  }
}
