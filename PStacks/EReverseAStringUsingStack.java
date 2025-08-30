package PStacks;

import java.util.Stack;

public class EReverseAStringUsingStack {
  public static void main(String[] args) {
    String input = "DanishKhan";
    Stack<Character> stack = new Stack<>();

    // Push all characters of the string into the stack
    for (char ch : input.toCharArray()) {
      stack.push(ch);
    }

    // Pop all characters from the stack and build the reversed string
    StringBuilder reversed = new StringBuilder();
    while (!stack.isEmpty()) {
      reversed.append(stack.pop());
    }

    System.out.println("Original String: " + input);
    System.out.println("Reversed String: " + reversed.toString());
  }
}
