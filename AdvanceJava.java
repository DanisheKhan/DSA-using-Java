public class AdvanceJava {

  // ! functions
  // public static void helloWorld() {
  // System.out.println("Hello World");
  // };

  // ! add two numbers
  public static int sum(int a, int b) {
    int sum;
    sum = a + b;
    return sum;
  }

  // ! find factorial of a number
  public static int fact(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
      result *= i;
    }
    System.out.println(result);
    return result;
  }

  public static void main(String args[]) {

    // ! function
    // helloWorld();
    // System.out.println(sum(15, 20));
    fact(3);
  };
};
