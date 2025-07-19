package FourTwoDimensionalArray;

public class TwoSpiralNumbers {

  public static void main(String[] args) {
    int n = 4; // Matrix size
    int matrix[][] = new int[n][n];

    int top = 0, bottom = n - 1;
    int left = 0, right = n - 1;
    int value = 1;

    while (top <= bottom && left <= right) {
      // Fill top row
      for (int i = left; i <= right; i++) {
        matrix[top][i] = value++;
      }
      top++;

      // Fill right column
      for (int i = top; i <= bottom; i++) {
        matrix[i][right] = value++;
      }
      right--;

      // Fill bottom row
      if (top <= bottom) {
        for (int i = right; i >= left; i--) {
          matrix[bottom][i] = value++;
        }
        bottom--;
      }

      // Fill left column
      if (left <= right) {
        for (int i = bottom; i >= top; i--) {
          matrix[i][left] = value++;
        }
        left++;
      }
    }

    // Print the spiral matrix
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(matrix[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
