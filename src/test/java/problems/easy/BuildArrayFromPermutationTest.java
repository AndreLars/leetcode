package problems.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BuildArrayFromPermutationTest {
  private final BuildArrayFromPermutation buildArrayFromPermutation =
      new BuildArrayFromPermutation();

  @Test
  void testCase1() {
    int[] nums = {0, 2, 1, 5, 3, 4};
    int[] expected = {0, 1, 2, 4, 5, 3};
    int[] answer = buildArrayFromPermutation.buildArray(nums);
    Assertions.assertArrayEquals(expected, answer);
  }

  @Test
  void testCase2() {
    int[] nums = {5, 0, 1, 2, 3, 4};
    int[] expected = {4, 5, 0, 1, 2, 3};
    int[] answer = buildArrayFromPermutation.buildArray(nums);
    Assertions.assertArrayEquals(expected, answer);
  }
}
