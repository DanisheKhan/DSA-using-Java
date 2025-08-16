package JDivideAndConquer;

public class BQuickSort {
  public static void printArr(int[] arr) {
    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println();
  }

  public static void quickSort(int[] arr, int startIdx, int endIdx) {
    if (startIdx >= endIdx) {
      return;
    }
    int pivotIdx = partition(arr, startIdx, endIdx);
    quickSort(arr, startIdx, pivotIdx - 1);
    quickSort(arr, pivotIdx + 1, endIdx);
  }

  public static int partition(int[] arr, int startIdx, int endIdx) {
    int pivot = arr[endIdx];
    int i = startIdx - 1;
    for (int j = startIdx; j < endIdx; j++) {
      if (arr[j] <= pivot) {
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    int temp = arr[i + 1];
    arr[i + 1] = arr[endIdx];
    arr[endIdx] = temp;
    return i + 1;
  }

  public static void main(String[] args) {
    int[] arr = { 5, 2, 9, 1, 5, 6 };
    quickSort(arr, 0, arr.length - 1);
    printArr(arr);

  }
}
