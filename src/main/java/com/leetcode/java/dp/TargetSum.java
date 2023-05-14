package com.leetcode.java.dp;

public class TargetSum {
  public int findTargetSumWays(int[] nums, int target) {
    // handle invalid cases
    if (nums == null) {
      return 0;
    }
    return findTargetSumWaysRec(nums, 0, 0, target);
  }

  private int findTargetSumWaysRec(int[] nums, int index, int sum, int target){
    if(index == nums.length){
      if(sum == target){
        return 1;
      }else{
        return 0;
      }
    }
    int resultByAddingIndex = findTargetSumWaysRec(nums, index+1, sum+nums[index], target);
    int resultBySubtractingIndex = findTargetSumWaysRec(nums, index+1, sum-nums[index], target);
    
    return resultByAddingIndex + resultBySubtractingIndex;
  }
}
