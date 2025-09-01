package PStacks;

import java.util.Stack;

public class IValidParentheses {
  public static boolean isValid(String parenthesesString) {
    Stack<Character> parenthesesStack = new Stack<>();
    for (char currentChar : parenthesesString.toCharArray()) {
      if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
        parenthesesStack.push(currentChar);
      } else {
        if (parenthesesStack.isEmpty())
          return false;
        if ((parenthesesStack.peek() == '(' && currentChar == ')')
            || (parenthesesStack.peek() == '{' && currentChar == '}')
            || (parenthesesStack.peek() == '[' && currentChar == ']')) {
          parenthesesStack.pop();
        } else {
          return false;
        }
      }
    }
    return parenthesesStack.isEmpty();
  }

  public static void main(String[] args) {
    String testString = "()[]{}";
    System.out.println(isValid(testString)); // true
    testString = "(]";
    System.out.println(isValid(testString)); // false
    testString = "([{}])";
    System.out.println(isValid(testString)); // true
  }
}
