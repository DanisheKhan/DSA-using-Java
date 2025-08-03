package EightRecursion;

public class BPrintNToOne {
  public static int printNum(int n) {

    if (n == 0) {
      return 1;
    } else {
      System.out.println(n);
      return printNum(--n);
    }
  }

  public static void main(String[] args) {
    printNum(50);
  }
}
