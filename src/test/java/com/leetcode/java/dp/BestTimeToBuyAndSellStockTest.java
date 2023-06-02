package com.leetcode.java.dp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BestTimeToBuyAndSellStockTest {
  BestTimeToBuyAndSellStock classUnderTest = new BestTimeToBuyAndSellStock();

  @Test
  public void testInput1(){
    int result = classUnderTest.maxProfit(new int[]{7,1,5,3,6,4});
    assertEquals(5, result);
  }

  @Test
  public void testInput2(){
    int result = classUnderTest.maxProfit(new int[]{7,6,4,3,1});
    assertEquals(0, result);
  }
}
