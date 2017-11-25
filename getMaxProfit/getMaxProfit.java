class Solution {
  public static int getMaxProfit(int[] prices) {
    if (prices.length < 2) {
      throw new IllegalArgumentException("Getting a profit requires at least 2 prices.");
    }

    int minPrice = prices[0];
    int maxProfit = prices[1] - prices[0];
    for (int i = 1; i < prices.length; i++) {
      int currentPrice = prices[i];
      int currentProfit = currentPrice - minPrice;

      maxProfit = Math.max(maxProfit, currentProfit);
      minPrice = Math.min(minPrice, currentPrice);
    }
    return maxProfit;
  }
  public static void main(String[] args) {
    int[] prices = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    // int[] prices = {1, 10, 3, 4, 5, 6, 7, 8, 9, 2};
    // int[] prices = {10, 2, 3, 4, 5, 6, 7, 8, 9, 1};
    // int[] prices = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    // int[] prices = {1};
    System.out.println(getMaxProfit(prices));
  }
}
