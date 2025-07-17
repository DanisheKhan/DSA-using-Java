package FourTwoDimensionalArray;

import java.util.*;

public class OneArrayDeclaration {
  int matrix[][] = new int[3][3];   
  int n = matrix.length;
  int m = matrix[0].length;

  Scanner sc = new Scanner(System.in);

  public void readMatrix() {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
  }

}
