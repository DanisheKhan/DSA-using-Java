package IRecursion;

public class MBinaryStringProblem {
  public static void main(String[] args) {
    int n = 3; // Example size
    generateBinaryStrings(n, "", '0');
  }

  static void generateBinaryStrings(int n, String str, char lastChar) {
    if (n == 0) {
      System.out.println(str);
      return;
    }
    generateBinaryStrings(n - 1, str + "0", '0');
    if (lastChar != '1') {
      generateBinaryStrings(n - 1, str + "1", '1');
    }
  }
}
