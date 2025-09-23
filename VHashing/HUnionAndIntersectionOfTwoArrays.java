package VHashing;

import java.util.HashSet;

public class HUnionAndIntersectionOfTwoArrays {
  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 4, 5, 6 };
    int[] arr2 = { 2, 3, 5, 7 };

    // Union
    HashSet<Integer> unionSet = new HashSet<>();
    for (int num : arr1)
      unionSet.add(num);
    for (int num : arr2)
      unionSet.add(num);
    System.out.println("Union: " + unionSet);

    // Intersection
    HashSet<Integer> set1 = new HashSet<>();
    for (int num : arr1)
      set1.add(num);
    HashSet<Integer> intersectionSet = new HashSet<>();
    for (int num : arr2) {
      if (set1.contains(num))
        intersectionSet.add(num);
    }
    System.out.println("Intersection: " + intersectionSet);
  }
}
