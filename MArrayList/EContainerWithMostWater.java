package MArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class EContainerWithMostWater {
  public static void main(String[] args) {
    ArrayList<Integer> height = new ArrayList<>(Arrays.asList(1, 8, 6, 2, 5, 4, 8, 3, 7));
    int maxWater = maxArea(height);
    System.out.println("Maximum water container: " + maxWater);
  }

  public static int maxArea(ArrayList<Integer> height) {
    int left = 0, right = height.size() - 1;
    int maxArea = 0;
    while (left < right) {
      int h = Math.min(height.get(left), height.get(right));
      int w = right - left;
      int area = h * w;
      maxArea = Math.max(maxArea, area);
      if (height.get(left) < height.get(right)) {
        left++;
      } else {
        right--;
      }
    }
    return maxArea;
  }
}
