public class ButterflyPattern {

  public static void BP(int rows) {
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      for (int j = 1; j <= 2 * (rows - i); j++) {
        System.err.print(" ");
      }

      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = rows; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      for (int k = 1; k <= 2 * (rows - i); k++) {
        System.err.print(" ");
      }

      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    BP(4);
  }
}
