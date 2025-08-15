package IRecursion;

public class DPrintSumOfNNaturalNum {
  public static int SN(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n + SN(n - 1);
    } 
  }

  public static void main(String[] args) {
    System.out.println(SN(2));

  }
}
