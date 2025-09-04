package RGreedyAlgorithm;

public class FIndianCoins {
  public static void main(String[] args) {
    int[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
    int amount = 2753;
    int count = 0;

    System.out.print("Coins used: ");
    for (int i = coins.length - 1; i >= 0; i--) {
      while (amount >= coins[i]) {
        amount -= coins[i];
        System.out.print(coins[i] + " ");
        count++;
      }
    }
    System.out.println("\nTotal coins used: " + count);
  }
}
