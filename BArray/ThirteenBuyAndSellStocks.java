package BArray;

public class ThirteenBuyAndSellStocks {

  public static int buyAndSellStocks(int prices[]) {
    if (prices == null || prices.length < 2) {
      return 0; // Not enough days to make a transaction
    }

    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < minPrice) {
        minPrice = prices[i];
      }
      else if (prices[i] - minPrice > maxProfit) {
        maxProfit = prices[i] - minPrice;
      }
    }
    return maxProfit;
  }

  public static void main(String[] args) {
    int prices[] = { 7, 1, 5, 3, 6, 4 };
    System.out.println("Maximum profit is: " + buyAndSellStocks(prices)); // Output: 5

  }
}
