package com.leetcode.java.dp.knapsack;

import java.util.HashMap;
import java.util.Map;

public class CoinChange {

  private Map<String, Integer> cache = new HashMap<>();
  public int coinChange(int[] coins, int amount) {
    int result = coinChange(coins, amount, 0, 0);
    if (result == Integer.MAX_VALUE) {
      return -1;
    }
    return result;
  }

  private int coinChange(int[] coins, int target, int number, int index) {
    if (target == 0) {
      return number;
    }
    if (target < 0 || index >= coins.length) {
      return Integer.MAX_VALUE;
    }
    if(cache.containsKey(index+"_"+target)){
      cache.get(index+"_"+target);
    }

    int includeCoin = coinChange(coins, target - coins[index], number + 1, index);
    cache.put(index+"_"+(target - coins[index]), includeCoin);
    int excludeCoin =  coinChange(coins, target, number, index + 1);
    cache.put((index+1)+"_"+(target), excludeCoin);

    return Math.min(includeCoin, excludeCoin);
  }
}
