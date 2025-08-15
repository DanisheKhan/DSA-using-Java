package GBitwiseOperators;

public class EightFastExponentiation {
  public static void main(String[] args) {
    int base = 2;
    int exponent = 10;
    int result = fastPower(base, exponent);
    System.out.println(base + "^" + exponent + " = " + result);
  }

  
  public static int fastPower(int base, int exponent) {
    int result = 1;
    while (exponent > 0) {
      if ((exponent & 1) == 1) {
        result *= base;
      }
      base *= base;
      exponent >>= 1;
    }
    return result;
  }
}
