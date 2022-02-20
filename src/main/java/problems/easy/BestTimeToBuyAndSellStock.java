package problems.easy;

public class BestTimeToBuyAndSellStock {
  // https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

  public int maxProfit(int[] prices) {
    int minPrice = Integer.MAX_VALUE;
    int bestProfit = 0;

    for (int price : prices) {
      minPrice = Math.min(price, minPrice);
      bestProfit = Math.max(bestProfit, price - minPrice);
    }
    return bestProfit;
  }
}
