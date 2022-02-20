package problems.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStockTest {
  private final BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock =
      new BestTimeToBuyAndSellStock();

  @Test
  void testCase1() {
    int[] input = {7, 1, 5, 3, 6, 4};
    int expected = 5;
    int actual = bestTimeToBuyAndSellStock.maxProfit(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void testCase2() {
    int[] input = {7, 6, 4, 3, 1};
    int expected = 0;
    int actual = bestTimeToBuyAndSellStock.maxProfit(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void testCase3() {
    int[] input = {1};
    int expected = 0;
    int actual = bestTimeToBuyAndSellStock.maxProfit(input);
    Assertions.assertEquals(expected, actual);
  }
}
