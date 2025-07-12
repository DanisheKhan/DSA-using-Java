package Array;

public class FiveBinarySearch {

  public static int binarySearch(int[] numbers, int target) {
    int start = 0, end = numbers.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (numbers[mid] == target)
        return mid;
      else if (numbers[mid] < target)
        start = mid + 1;
      else
        end = mid - 1;
    }
    return -1; // not found

  }

  public static void main(String[] args) {
    int[] numbers = { 2, 4, 6, 8, 10, 12, 14 };
    System.out.println(binarySearch(numbers, 8)); // Output: 3
  }

}
