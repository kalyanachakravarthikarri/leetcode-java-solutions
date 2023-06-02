package com.leetcode.java.dp;

public class PalindromPartitioning2 {

  public int minCut(String s) {
    return minCut(s, 0, 1);
  }

  private int minCut(String s, int st, int end) {
    if (end >= s.length()) {
      return isPalindrome(s.substring(st, end)) ? 0 : Integer.MAX_VALUE;
    }

    if(isPalindrome(s.substring(st, end))){
      return Math.min(1+minCut(s, end, end+1), minCut(s, st, end+1));
    }else{
      return minCut(s, st, end+1);
    }

  }

  private boolean isPalindrome(String str) {
    if (str == null || str.length() <= 1) {
      return true;
    }
    int i = 0, j = str.length()-1;
    while (i < j) {
      if (str.charAt(i++) != str.charAt(j--)) {
        return false;
      }
    }
    return true;
  }
}
