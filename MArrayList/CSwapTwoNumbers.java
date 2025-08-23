package MArrayList;

import java.util.*;

public class CSwapTwoNumbers {
  public static void main(ArrayList<Integer> list, int idx1, int idx2) {
    int temp = list.get(idx1);
    list.set(idx1, list.get(idx2));
    list.set(idx2, temp);
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 1; i <= 5; i++) {
      list.add(i);
    }
    main(list, 1, 3);
    System.out.println(list);
  }
}