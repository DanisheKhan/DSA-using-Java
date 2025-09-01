package PStacks;

import java.util.Stack;

public class JDuplicateParentheses {
  public static boolean hasDuplicateParentheses(String expr) {
    Stack<Character> stack = new Stack<>();

    for (char ch : expr.toCharArray()) {
      if (ch == ')') {
        int count = 0;
        while (!stack.isEmpty() && stack.peek() != '(') {
          stack.pop();
          count++;
        }
        if (!stack.isEmpty())
          stack.pop(); // pop the '('
        if (count == 0)
          return true; // duplicate found
      } else {
        stack.push(ch);
      }
    }
    return false;
  }

  public static void main(String[] args) {
    String expr1 = "((a+b))";
    String expr2 = "(a+(b)/c)";
    String expr3 = "(a+b*(c-d))";

    System.out.println(expr1 + " -> " + hasDuplicateParentheses(expr1)); // true
    System.out.println(expr2 + " -> " + hasDuplicateParentheses(expr2)); // false
    System.out.println(expr3 + " -> " + hasDuplicateParentheses(expr3)); // false
  }
}
