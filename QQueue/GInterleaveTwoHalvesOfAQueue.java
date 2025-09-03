package QQueue;

import java.util.LinkedList;
import java.util.Queue;

public class GInterleaveTwoHalvesOfAQueue {
  public static void interleaveQueue(Queue<Integer> q) {
    if (q.size() % 2 != 0) {
      throw new IllegalArgumentException("Queue size must be even");
    }
    int halfSize = q.size() / 2;
    Queue<Integer> firstHalf = new LinkedList<>();
    // Move first half to a new queue
    for (int i = 0; i < halfSize; i++) {
      firstHalf.add(q.remove());
    }
    // Interleave the two halves
    while (!firstHalf.isEmpty()) {
      q.add(firstHalf.remove());
      q.add(q.remove());
    }
  }

  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    // Example queue: 1 2 3 4 5 6
    for (int i = 1; i <= 6; i++) {
      q.add(i);
    }
    interleaveQueue(q);
    System.out.println(q); // Output: [1, 4, 2, 5, 3, 6]
  }

}
