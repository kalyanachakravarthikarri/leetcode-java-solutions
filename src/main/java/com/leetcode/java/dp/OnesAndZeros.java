package com.leetcode.java.dp;

import java.util.HashMap;
import java.util.Map;

public class OnesAndZeros {

  private Map<String, Integer> cache = new HashMap<>();

  public int findMaxForm(String[] strs, int m, int n) {
    if (strs == null || (m == 0 && n == 0)) {
      return 0;
    }
    return findMaxformRec(strs, m, n, 0);
  }

  private int findMaxformRec(String[] strs, int m, int n, int index) {

    if (index == strs.length) {
      return 0;
    }

    if (cache.containsKey(index + "_" + m + "_" + n)) {
      return cache.get(index + "_" + m + "_" + n);
    }
    String nextVal = strs[index];
    int numOf1s = 0;
    int numOf0s = 0;
    for (char c : nextVal.toCharArray()) {
      if (c == '0') {
        numOf0s++;
      } else {
        numOf1s++;
      }
    }
    if (numOf0s <= m && numOf1s <= n) {
      int result = Math.max(1 + findMaxformRec(strs, m - numOf0s, n - numOf1s, index + 1),
          findMaxformRec(strs, m, n, index + 1));
      cache.put(index + "_" + m + "_" + n, result);
      return result;
    } else {
      int result = findMaxformRec(strs, m, n, index + 1);
      cache.put(index + "_" + m + "_" + n, result);
      return result;
    }
  }

  public int findMaxForm_tabular(String[] strs, int m, int n) {

    int[][] dp = new int[m + 1][n + 1];
    for (String s : strs) {
      int numOf1s = 0;
      int numOf0s = 0;
      for (char c : s.toCharArray()) {
        if (c == '0') {
          numOf0s++;
        } else {
          numOf1s++;
        }
      }

      for(int i = m; i>=0; i--){
        for(int j = n; j>=0; j--){
          if(i >= numOf0s && j >= numOf1s){
            dp[i][j] = Math.max(dp[i][j], 1+ dp[i-numOf0s][j-numOf1s]);
          }
        }
      }
    }
    return dp[m][n];
  }
}
