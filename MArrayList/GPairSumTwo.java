package MArrayList;

import java.util.ArrayList;

public class GPairSumTwo {
  // Function to check if a pair with given sum exists using ArrayList
  public static boolean pairSum(ArrayList<Integer> arr, int target) {
    int n = arr.size();
    int pivot = -1;

    // Find the pivot (the largest element)
    for (int i = 0; i < n - 1; i++) {
      if (arr.get(i) > arr.get(i + 1)) {
        pivot = i;
        break;
      }
    }

    int left = (pivot + 1) % n; // Smallest element
    int right = pivot; // Largest element

    while (left != right) {
      int currSum = arr.get(left) + arr.get(right);
      if (currSum == target) {
        System.out.println("Pair found: " + arr.get(left) + ", " + arr.get(right));
        return true;
      }
      if (currSum < target) {
        left = (left + 1) % n;
      } else {
        right = (n + right - 1) % n;
      }
    }
    System.out.println("No pair found.");
    return false;
  }

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(11);
    arr.add(15);
    arr.add(6);
    arr.add(8);
    arr.add(9);
    arr.add(10);
    int target = 16;
    pairSum(arr, target);
  }
}
