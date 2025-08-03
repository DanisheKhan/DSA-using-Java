package EightRecursion;

public class CPrintNToOne {

  public static void NO(int n, int start) {
    if (n == start) {
      System.out.println("Done");
      return;
    } else {
      System.out.println(start);
      NO(n, start + 1);
    }
  }

  public static void main(String[] args) {

    NO(5, 1);
  }
}
