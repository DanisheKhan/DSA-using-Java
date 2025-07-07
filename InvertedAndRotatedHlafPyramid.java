public class InvertedAndRotatedHalfPyramid {

  public static void InvertedPyramid(int rows, int cols) {
    System.out.println("khan" + rows + cols);
    for(int i=1; i<=rows; i++){
      for (int j=1; j<=cols; j++){
        if(i==rows||j==cols || j==1) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
  public static void main(String args[]) {
    InvertedPyramid(5, 5);
  }
  }

  public static void main(String args[]) {
    InvertedPyramid(5);
  }

}
