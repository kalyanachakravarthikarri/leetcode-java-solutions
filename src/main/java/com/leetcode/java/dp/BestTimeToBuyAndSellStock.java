package com.leetcode.java.dp;

public class BestTimeToBuyAndSellStock {
  public int maxProfit(int[] prices) {
    
    if(prices == null || prices.length == 0){
      return -1;
    }

    int buyingPrice = prices[0];
    int maxProfit = Integer.MIN_VALUE;
    for(int i=0; i<prices.length; i++){
      if(prices[i] - buyingPrice > maxProfit){
        maxProfit = prices[i] - buyingPrice;
      }
      if(prices[i] < buyingPrice){
        buyingPrice = prices[i];
      }
    }
    return maxProfit;
  }
}
