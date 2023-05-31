package com.leetcode.java.dp;

import java.util.HashMap;
import java.util.Map;

public class DistinctSubsequence {

  Map<String, Integer> dp = new HashMap<>();
  public int numDistinct(String s, String t) {
    if(s == null || s.length() == 0){
      return 0;
    }

    if(t == null || t.length() == 0){
      return 0;
    }

    return numDistinct(s, t, 0, 0);
  }

  private int numDistinct(String s, String t, int m, int n){
    if(n == t.length()){
      return 1;
    }
    if(m == s.length()){
      return 0;
    }

    if(dp.containsKey(m+"_"+n)){
      return dp.get(m+"_"+n);
    }

    if(s.charAt(m) == t.charAt(n)){
      int result = numDistinct(s, t, m+1, n+1) + numDistinct(s, t, m+1, n);
      dp.put(m+"_"+n, result);
      return result;
    }else{
      return numDistinct(s, t, m+1, n);
    }
  }
}
