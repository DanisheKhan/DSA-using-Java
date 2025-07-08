public class DiamondPattern {

  public static void DP(int rows) {
    // Upper half of diamond
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= (rows - i); j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= (2 * i) - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // Lower half of diamond
    for (int i = rows - 1; i >= 1; i--) {
      for (int j = 1; j <= (rows - i); j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= (2 * i) - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    DP(5);
  }
}