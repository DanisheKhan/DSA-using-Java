package PStacks;

import java.util.Stack;

public class KMaxAreaInHistogram {
  public static void main(String[] args) {
    int[] heights = { 2, 1, 5, 6, 2, 3 };
    System.out.println("Maximum Area: " + largestRectangleArea(heights));
  }

  public static int largestRectangleArea(int[] heights) {
    int n = heights.length;
    int[] left = new int[n];
    int[] right = new int[n];

    // Find Next Smaller to Left
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < n; i++) {
      while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
        stack.pop();
      }
      left[i] = stack.isEmpty() ? -1 : stack.peek();
      stack.push(i);
    }

    // Find Next Smaller to Right
    stack.clear();
    for (int i = n - 1; i >= 0; i--) {
      while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
        stack.pop();
      }
      right[i] = stack.isEmpty() ? n : stack.peek();
      stack.push(i);
    }

    // Calculate max area
    int maxArea = 0;
    for (int i = 0; i < n; i++) {
      int width = right[i] - left[i] - 1;
      int area = heights[i] * width;
      maxArea = Math.max(maxArea, area);
    }
    return maxArea;
  }
}
