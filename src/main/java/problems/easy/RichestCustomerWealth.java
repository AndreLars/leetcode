package problems.easy;

public class RichestCustomerWealth {
  // https://leetcode.com/problems/richest-customer-wealth/

  public int maximumWealth(int[][] accounts) {
    int max = Integer.MIN_VALUE;
    for (int[] account : accounts) {
      int sum = 0;
      for (int i : account) {
        sum += i;
      }
      if (max < sum) {
        max = sum;
      }
    }
    return max;
  }
}
