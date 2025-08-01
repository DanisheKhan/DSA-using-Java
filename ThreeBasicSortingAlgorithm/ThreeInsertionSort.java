package ThreeBasicSortingAlgorithm;

public class ThreeInsertionSort {
  
  public static void insertionSort(int[] arr) {
    
    for (int i = 1; i < arr.length; i++) {
      int key = arr[i];
      int j = i - 1;
      
      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = key;
    }
  }

  public static void printArray(int[] arr) {
    for (int value : arr) {
      System.out.print(value + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] arr = {64, 34, 25, 12, 22, 11, 90};
    
    System.out.println("Original array:");
    printArray(arr);
    
    insertionSort(arr);
    
    System.out.println("Sorted array:");
    printArray(arr);
  }
}
