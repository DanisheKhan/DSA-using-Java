package QQueue;

import java.util.LinkedList;
import java.util.Queue;

public class EStackUsingQueue {
  private Queue<Integer> q1 = new LinkedList<>();
  private Queue<Integer> q2 = new LinkedList<>();

  // Push element onto stack
  public void push(int x) {
    q2.add(x);
    while (!q1.isEmpty()) {
      q2.add(q1.remove());
    }
    // Swap queues
    Queue<Integer> temp = q1;
    q1 = q2;
    q2 = temp;
  }

  // Removes the element on top of the stack
  public int pop() {
    if (q1.isEmpty())
      throw new RuntimeException("Stack is empty");
    return q1.remove();
  }

  // Get the top element
  public int top() {
    if (q1.isEmpty())
      throw new RuntimeException("Stack is empty");
    return q1.peek();
  }

  // Returns whether the stack is empty
  public boolean empty() {
    return q1.isEmpty();
  }

  public static void main(String[] args) {
    EStackUsingQueue stack = new EStackUsingQueue();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    System.out.println(stack.top()); // 30
    System.out.println(stack.pop()); // 30
    System.out.println(stack.top()); // 20
    System.out.println(stack.empty()); // false
  }
}
