package GBitwiseOperators;

public class FiveClearRangeOfBits {
  public static int clearRangeOfBits(int num, int i, int j) {
    int leftMask = (~0) << (j + 1);
    int rightMask = (1 << i) - 1;
    int mask = leftMask | rightMask;
    return num & mask;
  }

  public static void main(String[] args) {
    int num = 011111111; // 255 in decimal
    int i = 2;
    int j = 5;
    int result = clearRangeOfBits(num, i, j);
    System.out.println("Result: " + Integer.toBinaryString(result));
  }
}
