public class OMountainRanges {

  // Example: Count number of mountain ranges for given n
  public static int countMountainRanges(int n) {
    // Catalan number formula: Cn = (2n)! / ((n+1)! * n!)
    long res = 1;
    for (int i = 0; i < n; i++) {
      res = res * (2 * n - i) / (i + 1);
    }
    return (int)(res / (n + 1));
  }

  public static void main(String[] args) {
    int n = 4; // number of up/down steps
    System.out.println("Number of mountain ranges for n = " + n + ": " + countMountainRanges(n));
  }
}