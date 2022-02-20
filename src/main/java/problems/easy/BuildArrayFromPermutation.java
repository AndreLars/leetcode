package problems.easy;

public class BuildArrayFromPermutation {
  // https://leetcode.com/problems/build-array-from-permutation/

  public int[] buildArray(int[] nums) {
    int[] solution = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      solution[i] = nums[nums[i]];
    }
    return solution;
  }
}
