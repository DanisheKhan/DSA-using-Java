package FourTwoDimensionalArray;

import java.util.*;

public class OneArrayDeclaration {
  public static boolean Search(int matrix[][], int key) {
    int n = matrix.length;
    int m = matrix[0].length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (matrix[i][j] == key) {
          System.out.println("key is found at: " + (i + 1) + "," + (j + 1));
          return true;
        }
      }
    }
    System.out.println("Not found");
    return false;
  }

  public static void main(String[] args) {
    int matrix[][] = new int[3][3];
    int n = matrix.length;
    int m = matrix[0].length;

    Scanner sc = new Scanner(System.in);

    // Input
    System.out.println("Enter elements for 3x3 matrix:");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }

    // Output
    System.out.println("Matrix:");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }

    sc.close();

    Search(matrix, 4);
  }
}
