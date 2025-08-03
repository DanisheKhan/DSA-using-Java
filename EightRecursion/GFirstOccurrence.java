package EightRecursion;

public class GFirstOccurrence {
  public static int FO(int arr[], int key, int i) {
    if (i == arr.length) {
      return -1;
    } else if (arr[i] == key) {
      
      return i;
    }
    return FO(arr, key, i + 1);
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 3, 7, 5 };
    int key = 5;
    int index = FO(arr, key, 0);
    System.out.println("First occurrence of " + key + " is at index: " + index);
  }
}
