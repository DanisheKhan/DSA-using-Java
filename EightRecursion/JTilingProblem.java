package EightRecursion;

public class JTilingProblem {
  public static int TP(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }

    // vertical choice
    int vertical = TP(n - 1);

    // horizontal choice
    int horizontal = TP(n - 2);

    return vertical + horizontal;
  }

  public static void main(String[] args) {
    int n = 4 ;
    System.out.println(TP(n));
  }
}
