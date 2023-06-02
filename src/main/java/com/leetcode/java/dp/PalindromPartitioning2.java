package com.leetcode.java.dp;

import java.util.HashMap;
import java.util.Map;

public class PalindromPartitioning2 {

  Map<String, Integer> cache = new HashMap<>();
  
  public int minCut(String s) {
    return minCut(s, 0, 1);
  }

  private int minCut(String s, int st, int end) {
    if (end >= s.length()) {
      return isPalindrome(s.substring(st, end)) ? 0 : Integer.MAX_VALUE;
    }

    String key = st+"_"+end;
    if(cache.containsKey(key)){
      return cache.get(key);
    }

    if(isPalindrome(s.substring(st, end))){
      int result = Math.min(1+minCut(s, end, end+1), minCut(s, st, end+1));
      cache.put(key, result);
      return result;
    }else{
      int result = minCut(s, st, end+1);
      cache.put(key, result);
      return result;
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
