package problems.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConcatenationOfArrayTest {
  private final ConcatenationOfArray concatenationOfArray = new ConcatenationOfArray();

  @Test
  void testCase1() {
    int[] input = {1, 2, 1};
    int[] expected = {1, 2, 1, 1, 2, 1};
    int[] result = concatenationOfArray.getConcatenation(input);
    Assertions.assertArrayEquals(expected, result);
  }

  @Test
  void testCase2() {
    int[] input = {1, 3, 2, 1};
    int[] expected = {1, 3, 2, 1, 1, 3, 2, 1};
    int[] result = concatenationOfArray.getConcatenation(input);
    Assertions.assertArrayEquals(expected, result);
  }
}
