package MArrayList;

import java.util.ArrayList;

public class BFindMaximum {
  public static int findMax(ArrayList<Integer> list) {
    if (list == null || list.isEmpty()) {
      throw new IllegalArgumentException("List is empty or null");
    }
    int max = list.get(0);
    for (int num : list) {
      if (num > max) {
        max = num;
      }
      // max=Math.max(max, list.get(i));
    }
    return max;
  }

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(25);
    numbers.add(7);
    numbers.add(42);
    numbers.add(18);

    int maximum = findMax(numbers);
    System.out.println("Maximum value: " + maximum);
  }
}
