package FiveString;

public class FivePrintLargestString {
  public static void main(String[] args) {
    String[] fruits = { "apple", "banana", "orange", "mango", "grapes" };

    String largest = fruits[0];
    for (int i = 0; i < fruits.length; i++) {
      if (largest.compareToIgnoreCase(fruits[i]) < 0) {
        largest = fruits[i];
      }
    }
    System.out.println(largest);
  }
}
