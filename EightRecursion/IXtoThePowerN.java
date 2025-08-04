package EightRecursion;

public class IXtoThePowerN {
  public static int power(int x, int n) {
    if (n == 0) {
      return 1;
    }
    return x * power(x, n - 1);
  }

  // optimize way
  public static int powerOptimized(int x, int n) {
    if (n == 0) {
      return 1;
    }
    int halfPower = powerOptimized(x, n / 2);
    if (n % 2 == 0) {
      return halfPower * halfPower;
    } else {
      return x * halfPower * halfPower;
    }
  }



  public static void main(String[] args) {
    int x = 2;
    int n = 5;
    System.out.println(power(x, n)); 
    System.out.println(powerOptimized(x, n)); 
  }

}