package com.leetcode.java.dp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Triangle {

  Map<String, Integer> cache = new HashMap<>();
  public int minimumTotal(List<List<Integer>> triangle) {
        return minimalTotal(triangle, 0, 0);
  }

  private int minimalTotal(List<List<Integer>> triangle, int row, int col){
    if(row >= triangle.size()){
      return 0;
    }
    if(cache.containsKey(row+"_"+col)){
      return cache.get(row+"_"+col);
    }
    int i = triangle.get(row).get(col) + minimalTotal(triangle, row+1, col);
    int j = triangle.get(row).get(col) + minimalTotal(triangle, row+1, col+1);
    int result = Math.min(i ,j);
    cache.put(row+"_"+col, result);
    return result;
  }
}
