package QQueue;

import java.util.*;

public class IDeque {
  public static void main(String[] args) {

    Deque<Integer> d = new LinkedList<>();
    d.addFirst(10);
    d.addLast(20);
    System.out.println(d.removeFirst()); // 10
    System.out.println(d.removeLast()); // 20
    d.addFirst(30);
    d.addLast(40);
    System.out.println(d.peekFirst()); // 30
    System.out.println(d.peekLast()); // 40
    System.out.println(d.isEmpty()); // false
    System.out.println(d.size()); // 2
    System.out.println(d.removeFirst()); // 30
    System.out.println(d.removeLast()); // 40
    System.out.println(d.isEmpty()); // true
  }
}