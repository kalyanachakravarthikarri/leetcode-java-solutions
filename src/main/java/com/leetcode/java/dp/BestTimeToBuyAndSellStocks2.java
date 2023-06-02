package com.leetcode.java.dp;

import java.util.HashMap;
import java.util.Map;

public class BestTimeToBuyAndSellStocks2 {

  Map<String, Integer> cache = new HashMap<>();
  
  public int maxProfit(int[] prices) {
        return Math.max(maxProfit(prices, 1, true, prices[0]),
        maxProfit(prices, 1, false, 0));
  }

  private int maxProfit(int[] prices, int index, boolean canSell, int buyingPrice){
    if(index == prices.length){
      return 0;
    }
    String key = index+"_"+buyingPrice+"_"+canSell;
    if(cache.containsKey(key)) return cache.get(key);

    if(canSell){
      int sellToday = (prices[index] - buyingPrice) + maxProfit(prices, index+1, false, 0);
      int holdToday = maxProfit(prices, index+1, true, buyingPrice);
      cache.put(key, Math.max(sellToday, holdToday));
      return Math.max(sellToday, holdToday);
    }else{
      int buyToday = maxProfit(prices, index+1, true, prices[index]);
      int holdToday = maxProfit(prices, index+1, false, buyingPrice);
      cache.put(key, Math.max(buyToday, holdToday));
      return Math.max(buyToday, holdToday);
    }
  }
}
