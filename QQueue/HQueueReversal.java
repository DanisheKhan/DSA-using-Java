package QQueue;

import java.util.*;

public class HQueueReversal {
  // Function to reverse a queue
  public static void reverseQueue(Queue<Integer> queue) {
    Stack<Integer> stack = new Stack<>();
    // Push all elements of queue to stack
    while (!queue.isEmpty()) {
      stack.push(queue.poll());
    }
    // Pop all elements from stack and add back to queue
    while (!stack.isEmpty()) {
      queue.add(stack.pop());
    }
  }

  public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(10);
    queue.add(20);
    queue.add(30);
    queue.add(40);

    System.out.println("Original Queue: " + queue);
    reverseQueue(queue);
    System.out.println("Reversed Queue: " + queue);
  }
}
