package com.leetcode.java.dp;

import java.util.HashMap;
import java.util.Map;

public class BestTimeToBuyAndSellStocks4 {
  Map<String, Integer> cache = new HashMap<>();
  
  public int maxProfit(int k, int[] prices) {
        return Math.max(maxProfit(prices, k, 1, true, prices[0], 0),
        maxProfit(prices, k, 1, false, 0, 0));
  }

  private int maxProfit(int[] prices, int k, int index, boolean canSell, int buyingPrice, int transactions){
    if(index == prices.length || transactions >= k){
      return 0;
    }
    String key = index+"_"+buyingPrice+"_"+canSell+"_"+transactions;
    if(cache.containsKey(key)) return cache.get(key);

    if(canSell){
      int sellToday = (prices[index] - buyingPrice) + maxProfit(prices, k, index+1, false, 0, transactions+1);
      int holdToday = maxProfit(prices, k, index+1, true, buyingPrice, transactions);
      cache.put(key, Math.max(sellToday, holdToday));
      return Math.max(sellToday, holdToday);
    }else{
      int buyToday = maxProfit(prices, k, index+1, true, prices[index], transactions);
      int holdToday = maxProfit(prices, k, index+1, false, buyingPrice, transactions);
      cache.put(key, Math.max(buyToday, holdToday));
      return Math.max(buyToday, holdToday);
    }
  }
}
