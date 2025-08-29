package PStacks;

import java.util.*;

class CStackUsingJavaCollectionFramwork {
  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(10);
    s.push(20);
    s.push(30);

    System.out.print("Stack elements: ");
    while (!s.isEmpty()) {
      System.out.print(s.peek() + " ");
      s.pop();
    }
    System.out.println();
  }
}