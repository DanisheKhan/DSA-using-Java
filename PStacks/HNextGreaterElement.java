package PStacks;

//this is IMP question
import java.util.Stack;

public class HNextGreaterElement {
  public static void main(String[] args) {
    int[] arr = { 4, 5, 2, 25 };
    int[] result = nextGreaterElements(arr);

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i] + " --> " + result[i]);
    }
  }

  public static int[] nextGreaterElements(int[] arr) {
    int n = arr.length;
    int[] res = new int[n];
    Stack<Integer> stack = new Stack<>();

    for (int i = n - 1; i >= 0; i--) {
      while (!stack.isEmpty() && stack.peek() <= arr[i]) {
        stack.pop();
      }
      res[i] = stack.isEmpty() ? -1 : stack.peek();
      stack.push(arr[i]);
    }
    return res;
  }
}
