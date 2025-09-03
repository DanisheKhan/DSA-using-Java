package QQueue;

import java.util.Stack;

public class DQueueUsingTwoStacks {
  private Stack<Integer> frontStack;
  private Stack<Integer> backStack;

  public DQueueUsingTwoStacks() {
    frontStack = new Stack<>();
    backStack = new Stack<>();
  }

  // Add to front
  public void addFront(int x) {
    frontStack.push(x);
  }

  // Add to back
  public void addBack(int x) {
    backStack.push(x);
  }

  // Remove from front
  public int removeFront() {
    if (frontStack.isEmpty()) {
      while (!backStack.isEmpty()) {
        frontStack.push(backStack.pop());
      }
    }
    if (frontStack.isEmpty())
      throw new RuntimeException("Deque is empty");
    return frontStack.pop();
  }

  // Remove from back
  public int removeBack() {
    if (backStack.isEmpty()) {
      while (!frontStack.isEmpty()) {
        backStack.push(frontStack.pop());
      }
    }
    if (backStack.isEmpty())
      throw new RuntimeException("Deque is empty");
    return backStack.pop();
  }

  // Check if empty
  public boolean isEmpty() {
    return frontStack.isEmpty() && backStack.isEmpty();
  }

  public static void main(String[] args) {
    DQueueUsingTwoStacks dq = new DQueueUsingTwoStacks();
    dq.addFront(1);
    dq.addBack(2);
    dq.addFront(3);
    System.out.println(dq.removeBack()); // 2
    System.out.println(dq.removeFront()); // 3
    System.out.println(dq.removeFront()); // 1
  }
}
