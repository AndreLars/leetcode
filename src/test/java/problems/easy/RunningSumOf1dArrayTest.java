package problems.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RunningSumOf1dArrayTest {
  private final RunningSumOf1dArray runningSumOf1dArray = new RunningSumOf1dArray();

  @Test
  void testCase1() {
    int[] input = {1, 2, 3, 4};
    int[] expected = {1, 3, 6, 10};
    int[] result = runningSumOf1dArray.runningSum(input);
    Assertions.assertArrayEquals(expected, result);
  }

  @Test
  void testCase2() {
    int[] input = {1, 1, 1, 1, 1};
    int[] expected = {1, 2, 3, 4, 5};
    int[] result = runningSumOf1dArray.runningSum(input);
    Assertions.assertArrayEquals(expected, result);
  }

  @Test
  void testCase3() {
    int[] input = {3, 1, 2, 10, 1};
    int[] expected = {3, 4, 6, 16, 17};
    int[] result = runningSumOf1dArray.runningSum(input);
    Assertions.assertArrayEquals(expected, result);
  }

  @Test
  void testCase4() {
    int[] input = {0};
    int[] expected = {0};
    int[] result = runningSumOf1dArray.runningSum(input);
    Assertions.assertArrayEquals(expected, result);
  }
}
