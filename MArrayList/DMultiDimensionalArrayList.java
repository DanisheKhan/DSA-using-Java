package MArrayList;

import java.util.ArrayList;

public class DMultiDimensionalArrayList {
  public static void main(String[] args) {
    // Create a 2D ArrayList (ArrayList of ArrayLists)
    ArrayList<ArrayList<Integer>> multiList = new ArrayList<>();

    // Populate the 2D ArrayList
    int rows = 3, cols = 4;
    for (int i = 0; i < rows; i++) {
      ArrayList<Integer> row = new ArrayList<>();
      for (int j = 0; j < cols; j++) {
        row.add(i * 10 + j);
      }
      multiList.add(row);
    }

    // Print the 2D ArrayList
    for (ArrayList<Integer> row : multiList) {
      System.out.println(row);
    }
  }
}
