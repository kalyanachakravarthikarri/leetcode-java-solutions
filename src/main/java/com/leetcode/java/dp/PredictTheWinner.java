package com.leetcode.java.dp;

public class PredictTheWinner {
  public boolean predictTheWinner(int[] nums) {
    if (nums == null) {
      return true;
    }

    return predictTheWinner(nums, 0, nums.length-1, 0, 0);
  }

  private boolean predictTheWinner(int[] nums, int i, int j, int player1_score, int player2_score){
    if(i >= j || i>nums.length || j<0){
      return player1_score >= player2_score;
    }
    return predictTheWinner(nums, i+1, j-1, player1_score+nums[i], player2_score+nums[j]) || 
    predictTheWinner(nums, i+2, j, player1_score+nums[i], player2_score+nums[i+1]) || 
    predictTheWinner(nums, i+1, j-1, player1_score+nums[j], player2_score+nums[i]) || 
    predictTheWinner(nums, i, j-2, player1_score+nums[j], player2_score+nums[j-1]);
  }
}
