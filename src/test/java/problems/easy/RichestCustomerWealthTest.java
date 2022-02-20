package problems.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RichestCustomerWealthTest {
  private final RichestCustomerWealth richestCustomerWealth = new RichestCustomerWealth();

  @Test
  void testCase1() {
    int[][] input = {{1, 2, 3}, {3, 2, 1}};
    int expected = 6;
    int actual = richestCustomerWealth.maximumWealth(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void testCase2() {
    int[][] input = {{1, 5}, {7, 3}, {3, 5}};
    int expected = 10;
    int actual = richestCustomerWealth.maximumWealth(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void testCase3() {
    int[][] input = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
    int expected = 17;
    int actual = richestCustomerWealth.maximumWealth(input);
    Assertions.assertEquals(expected, actual);
  }
}
