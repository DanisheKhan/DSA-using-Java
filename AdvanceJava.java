public class AdvanceJava {

  // ! functions
  // public static void helloWorld() {
  // System.out.println("Hello World");
  // };

  // ! add two numbers
  // public static int sum(int a, int b) {
  // int sum;
  // sum = a + b;
  // return sum;
  // }

  // ! find factorial of a number
  // public static int fact(int n) {
  // int result = 1;
  // for (int i = 1; i <= n; i++) {
  // result *= i;
  // }
  // System.out.println(result);
  // return result;
  // }

  // ! Binomial Coefficient
  // public static int bico(int n, int r) {
  // int nFact = fact(n);
  // int rFact = fact(r);
  // int nrFact = fact(n - r);

  // int result = (nFact / (rFact * (nrFact)));
  // return result;
  // }

  // ! prime number
  public static boolean isPrime(int n) {
    if (n == 2) {
      return true;
    }

    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  // ! print all prime in a range
  public static int PrimeInRange(int n) {
    for (int i = 2; i <= n; i++) {
      if (isPrime(i)) {
        System.out.println(i + " is a prime number");
      }
    }
    return n;
  }

  // ! convert binary to decimal
  public static void binToDec(int binNum) {
    int myNum = binNum;
    int pow = 0;
    int decNum = 0;
    while (binNum > 0) {
      int lastDigit = binNum % 10;
      decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
      pow++;
      binNum = binNum / 10;

    }
    System.out.println("Decimal of " + myNum + " = " + decNum);

  }

  // ! convert decimal to binary
  public static void decToBin(int n) {
    int myNum = n;
    int pow = 0;
    int binNum = 0;

    while (n > 0) {
      int rem = n % 2;
      binNum = binNum + (rem * (int) Math.pow(10, pow));
      pow++;
      n = n / 2;

    }

    System.out.println("Binary of " + myNum + " = " + binNum);
  }

  public static void main(String args[]) {

    // ! function
    // helloWorld();
    // System.out.println(sum(15, 20));
    // System.out.println(fact(3));
    // System.out.println("BC :"+bico(7, 4));
    // System.out.println(isPrime(20));
    // PrimeInRange(20);
    // binToDec(101);
    decToBin(88);

  };
};
