package DTwoDimensionalArray;

public class FourSearchInSortedMatrix {

  public static boolean StairCase(int matrix[][], int key) {
    int row = 0;
    int col = matrix[0].length - 1;

    while (row < matrix.length && col >= 0) {
      if (matrix[row][col] == key) {
        System.out.println("Key " + key + " found at position: (" + row + ", " + col + ")");
        return true;
      } else if (matrix[row][col] > key) {
        col--;
      } else {
        row++;
      }
    }
    System.out.println("Key " + key + " not found in the matrix");
    return false;
  }

  public static void main(String[] args) {
    int[][] matrix = { { 1, 4, 7, 11 }, { 2, 5, 8, 12 }, { 3, 6, 9, 16 }, { 10, 13, 14, 17 } };

    int key = 14;
    StairCase(matrix, key); 
  }
}
