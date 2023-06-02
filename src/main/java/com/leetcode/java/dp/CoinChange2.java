package com.leetcode.java.dp;

import java.util.HashMap;
import java.util.Map;

public class CoinChange2 {

  Map<String, Integer> cache = new HashMap<>();
  public int change(int amount, int[] coins) {
    return change(amount, coins, 0, 0);
  }

  private int change(int amount, int[] coins, int index, int currentSum) {
    if (currentSum == amount) {
      return 1;
    }
    if (currentSum > amount || index >= coins.length) {
      return 0;
    }

    String key = index+"_"+currentSum;
    if(cache.containsKey(key)){
      return cache.get(key);
    }

    int result = change(amount, coins, index, currentSum + coins[index])
        + change(amount, coins, index + 1, currentSum);
    cache.put(key, result);

    return result;
  }
}
