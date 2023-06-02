package com.leetcode.java.dp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BestTimeToBuyAndSellStocks4Test {
  BestTimeToBuyAndSellStocks4 classUnderTest = new BestTimeToBuyAndSellStocks4();

  @Test
  public void testInput1(){
    int result = classUnderTest.maxProfit(2, new int[]{2,4,1});
    assertEquals(2, result);
  }

  @Test
  public void testInput2(){
    int result = classUnderTest.maxProfit(2, new int[]{3,2,6,5,0,3});
    assertEquals(7, result);
  }
}
