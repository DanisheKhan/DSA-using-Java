package QQueue;

import java.util.*;

public class CQueueUsingJavaCollectionFramwork {
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();

    // Enqueue (add elements)
    q.add(10);
    q.add(20);
    q.add(30);

    // Peek (view front element)
    System.out.println("Front element: " + q.peek());

    // Dequeue (remove elements)
    System.out.println("Removed: " + q.poll());
    System.out.println("Removed: " + q.poll());

    // Check if queue is empty
    System.out.println("Is queue empty? " + q.isEmpty());

    // Display remaining elements
    System.out.println("Queue: " + q);
  }
}
