package com.leetcode.java.dp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BestTimeToBuyAndSellStocks3Test {
  BestTimeToBuyAndSellStocks3 classUnderTest = new BestTimeToBuyAndSellStocks3();

  @Test
  public void testInput1(){
    int result = classUnderTest.maxProfit(new int[]{3,3,5,0,0,3,1,4});
    assertEquals(6, result);
  }

  @Test
  public void testInput2(){
    int result = classUnderTest.maxProfit(new int[]{1,2,3,4,5});
    assertEquals(4, result);
  }

  @Test
  public void testInput3(){
    int result = classUnderTest.maxProfit(new int[]{14,9,10,12,4,8,1,16});
    assertEquals(19, result);
  }
}
