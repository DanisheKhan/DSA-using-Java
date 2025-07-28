package SevenOOPs;

public class NinePolymorphismMethodOverloading {
  public static void main(String[] args) {
    Calculator calc = new Calculator();
    System.out.println(calc.sum(5, 3));
    System.out.println(calc.sum((float) 5.26, (float) 3.65));
    System.out.println(calc.sum(5, 3, 65));

  }
}

class Calculator {
  int sum(int a, int b) {
    return a + b;
  }

  float sum(float a, float b) {
    return a + b;
  }

  int sum(int a, int b, int c) {
    return a + b + c;
  }
}