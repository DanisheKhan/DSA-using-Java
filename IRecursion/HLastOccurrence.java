package IRecursion;

public class HLastOccurrence {
  public static int LO(int arr[], int key, int i) {
    if (i == arr.length) {
      return -1;
    }
    int found = LO(arr, key, i + 1);
    if (found == -1 && arr[i] == key) {
      return i;
    }
    return found;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 3, 7, 5 };
    int key = 5;
    int index = LO(arr, key, 0);
    System.out.println("Last occurrence of " + key + " is at index: " + index);
  }
}
