package Array;

public class eightPrintSubarray {

  public static void PS(int num[]) {
    for (int i = 0; i < num.length; i++) {
      for (int j = i; j < num.length; j++) {
        for (int k = j; k < num.length; k++) {
          System.out.print(num[k] + " ");
        }
        System.out.println();
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int num[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
    PS(num);
  }
}
