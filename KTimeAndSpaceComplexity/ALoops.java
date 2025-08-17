package KTimeAndSpaceComplexity;

public class ALoops {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println("Hello World");
    }
  }
  // O(n)

  public static void nestedLoopNSquare(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        System.out.println("i: " + i + ", j: " + j);
      }
    }
    // O(n^2)
  }

  public static void nestedLoopNSquareScend(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.println("i: " + i + ", j: " + j);
      }
    }
    // O(n^2)
  }

  public static void nestedLoopON(int n) {
    int k = 5;
    for (int i = 0; i < n; i = i + k) {
      for (int j = i + 1; j <= k; j++) {
        System.out.println("i: " + i + ", j: " + j);
      }
    }
    // O(n)
  }
}
