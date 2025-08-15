package DTwoDimensionalArray;

public class ThreeDiagonalSum {

  // public static int DS(int matrix[][]) {
  //   int sum = 0;
  //   for (int i = 0; i < matrix.length; i++) {
  //     for (int j = 0; j < matrix[0].length; j++) {
  //       if (i == j) {
  //         sum += matrix[i][j];
  //       }else if(i+j==matrix.length-1){
  //         sum += matrix[i][j];
  //       }  
  //     }

  //   }
  //   return sum;
  // }
  
  public static int DS(int matrix[][]) {
    int sum = 0;
    int n = matrix.length;
    
    for (int i = 0; i < n; i++) {
      sum += matrix[i][i]; // Primary diagonal
      if (i != n - 1 - i) { // Avoid double counting center element in odd-sized matrix
        sum += matrix[i][n - 1 - i]; // Secondary diagonal
      }
    }
    
    return sum;
  }

  public static void main(String[] args) {
    int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

    System.out.println(DS(matrix));
  }


}
