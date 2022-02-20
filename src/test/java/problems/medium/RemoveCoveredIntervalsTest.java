package problems.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveCoveredIntervalsTest {
  private final RemoveCoveredIntervals removeCoveredIntervals = new RemoveCoveredIntervals();

  @Test
  void testCase1() {
    int[][] input = {{1, 4}, {3, 6}, {2, 8}};
    int expected = 2;
    int actual = removeCoveredIntervals.removeCoveredIntervals(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void testCase2() {
    int[][] input = {{1, 4}, {2, 3}};
    int expected = 1;
    int actual = removeCoveredIntervals.removeCoveredIntervals(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void testCase3() {
    int[][] input = {
      {66672, 75156},
      {59890, 65654},
      {92950, 95965},
      {9103, 31953},
      {54869, 69855},
      {43332, 89722},
      {4218, 57729},
      {20993, 92876}
    };
    int expected = 3;
    int actual = removeCoveredIntervals.removeCoveredIntervals(input);
    Assertions.assertEquals(expected, actual);
  }
}
