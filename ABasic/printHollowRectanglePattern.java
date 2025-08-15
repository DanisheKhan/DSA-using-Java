public class printHollowRectanglePattern {

  public static void hollowRectangle(int noRows, int noColumns) {

    for (int i = 1; i <= noRows; i++) {
      for (int j = 1; j <= noColumns; j++) {
        if (i == 1 || i == noRows || j == 1 || j == noColumns) {
          System.out.print(" *");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }

  }

  public static void main(String args[]) {
    hollowRectangle(10, 10);
  }
}
