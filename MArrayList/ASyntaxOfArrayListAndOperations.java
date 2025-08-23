package MArrayList;

import java.util.*;

public class ASyntaxOfArrayListAndOperations {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    // add elements
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(6);
    list.add(5);
    // System.out.println(list);

    // list.add(2, 25);
    // System.out.println(list);

    // Get Operation
    // int element = list.get(3);
    // System.out.println(element);
    // System.out.println(list.get(2));

    // Remove Operation
    // list.remove(5);
    // System.out.println(list);

    // Set
    // list.set(5, 7);
    // System.out.println(list);

    // contains
    // System.out.println(list.contains(l3));
    // System.out.println(list.contains(1));

    // size
    // System.out.println(list.size());

    // Printing the ArrayList
    // for (int i = 0; i < list.size(); i++) {
    // System.out.print(list.get(i) + " ");
    // }

    // Printing reverse arraylist
    // for (int i = list.size()-1; i >= 0; i--) {
    // System.out.print(list.get(i) + " ");
    // }

    // Inbuilt sorting
    Collections.sort(list);
    System.err.println(list);

    Collections.sort(list, Collections.reverseOrder());
    System.out.println(list);

  }
}
