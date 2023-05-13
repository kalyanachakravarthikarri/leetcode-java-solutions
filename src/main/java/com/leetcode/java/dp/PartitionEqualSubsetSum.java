package com.leetcode.java.dp;

public class PartitionEqualSubsetSum {
  boolean cache[][] = null;

  public boolean canPartition(int[] nums) {
    if (nums == null || nums.length == 0) {
      return false;
    }

    int sum = 0;
    for (int num : nums) {
      sum += num;
    }

    cache = new boolean[nums.length + 1][sum + 1];

    if (sum % 2 != 0) {
      return false;
    }

    return canPartition(nums, 0, sum / 2);
  }

  private boolean canPartition(int[] nums, int index, int sum) {
    System.out.println(index + " -- "+ sum);
    if (sum == 0) {
      return true;
    }
    if (index >= nums.length || sum < 0) {
      return false;
    }
    if (cache[index][sum]) {
      return cache[index][sum];
    }

    return cache[index][sum] = canPartition(nums, index + 1, sum)
        || canPartition(nums, index+1, sum - nums[index]);
  }
}
