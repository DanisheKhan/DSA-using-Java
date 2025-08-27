package OLinkedList;

import java.util.LinkedList;

public class BJavaBuiltinLinkedList {
  public static void main(String[] args) {
    // Create a LinkedList of Integers
    LinkedList<Integer> list = new LinkedList<>();

    // Add elements
    list.add(10); // add at end
    list.add(20);
    list.addFirst(5); // add at beginning
    list.addLast(30); // add at end

    // Print the list
    System.out.println("LinkedList: " + list);

    // Get elements
    int first = list.getFirst();
    int last = list.getLast();
    int second = list.get(1);
    System.out.println("First: " + first + ", Last: " + last + ", Second: " + second);

    // Remove elements
    list.removeFirst(); // removes 5
    list.removeLast(); // removes 30
    list.remove(0); // removes 10

    System.out.println("After removals: " + list);

    // Check if list contains an element
    boolean contains20 = list.contains(20);
    System.out.println("Contains 20? " + contains20);

    // Size of the list
    System.out.println("Size: " + list.size());

    // Iterate over the list
    for (int num : list) {
      System.out.println("Element: " + num);
    }

    // Clear the list
    list.clear();
    System.out.println("Cleared list: " + list);
  }
}
