package PStacks;

import java.util.Stack;

public class DPushAtTheBottomOfStack {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(2);
    stack.push(3);
    stack.push(4);

    int valueToPush = 1;
    pushAtBottom(stack, valueToPush);

    while (!stack.isEmpty()) {
      System.out.println(stack.pop());
    }
  }

  // Recursive function to push an element at the bottom of the stack
  public static void pushAtBottom(Stack<Integer> stack, int value) {
    if (stack.isEmpty()) {
      stack.push(value);
      return;
    }
    int top = stack.pop();
    pushAtBottom(stack, value);
    stack.push(top);
  }
}
