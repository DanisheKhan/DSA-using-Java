package JDivideAndConquer;

public class CSearchInRotatedSortedArray {
  public static int search(int[] arr, int target) {
    int left = 0, right = arr.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (arr[mid] == target) {
        return mid;
      }
      // Left half is sorted
      if (arr[left] <= arr[mid]) {
        if (arr[left] <= target && target < arr[mid]) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      }
      // Right half is sorted
      else {
        if (arr[mid] < target && target <= arr[right]) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int[] arr = {4, 5, 6, 7, 0, 1, 2};
    int target = 0;
    int result = search(arr, target);
    System.out.println("Index of target: " + result);
  }
}
