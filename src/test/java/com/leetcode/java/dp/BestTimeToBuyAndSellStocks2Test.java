package com.leetcode.java.dp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BestTimeToBuyAndSellStocks2Test {
  BestTimeToBuyAndSellStocks2 classUnderTest = new BestTimeToBuyAndSellStocks2();

  @Test
  public void testInput1(){
    int result = classUnderTest.maxProfit(new int[]{7,1,5,3,6,4});
    assertEquals(7, result);
  }

  @Test
  public void testInput2(){
    int result = classUnderTest.maxProfit(new int[]{7,6,4,3,1});
    assertEquals(0, result);
  }
}
