package Array;

public class FourLargestNumber {
  public static int LN(int numbers[]) {
    int prev = Integer.MIN_VALUE;
    for (int i = 0; i < numbers.length; i++) {
      if (prev < numbers[i]) {
        prev = numbers[i];
      }
    }
    return prev;

  }

  public static void main(String[] args) {

    int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
    System.out.println(LN(numbers));
  }
}
