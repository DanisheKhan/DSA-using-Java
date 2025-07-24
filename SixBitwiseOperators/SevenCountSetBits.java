package SixBitwiseOperators;

public class SevenCountSetBits {
  public static void main(String[] args) {
    int n = 29; 
    System.out.println("Set bits: " + countSetBits(n));
  }

  public static int countSetBits(int n) {
    int count = 0;
    while (n != 0) {
      count += n & 1;
      n >>= 1;
    }
    return count;
  }
}
