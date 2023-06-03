package com.leetcode.java.dp;

public class NumberOfLIS {
  public int findNumberOfLIS(int[] nums) {
    if(nums == null){
      return 0;
    }

    int lengthOfLIS = findLengthOfLIS(nums, 0, Integer.MIN_VALUE, 0);
    System.out.println("lengthOfLIS "+lengthOfLIS);
    return findNumberOfLIS(nums, 0, Integer.MIN_VALUE, 0, lengthOfLIS);
  }

  private int findNumberOfLIS(int[] nums, int index, int prev, int currentLength, int lengthOfLIS){
    if(currentLength == lengthOfLIS){
      return 1;
    }
    if(index >= nums.length){
      return 0;
    }
    if(nums[index] > prev){
      return findNumberOfLIS(nums, index+1, nums[index], currentLength+1, lengthOfLIS) + findNumberOfLIS(nums, index+1, prev, currentLength, lengthOfLIS);
    }else{
      return findNumberOfLIS(nums, index+1, prev, currentLength, lengthOfLIS);
    }
  }

  private int findLengthOfLIS(int[] nums, int index, int prev, int currentLength){
    if(index >= nums.length){
      return currentLength;
    }
    if(nums[index] > prev){
      return Math.max(findLengthOfLIS(nums, index+1, nums[index], currentLength+1), findLengthOfLIS(nums, index+1, prev, currentLength));
    }else{
      return findLengthOfLIS(nums, index+1, prev, currentLength);
    }
  }
}
