package com.leetcode.java.dp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CoinChange2Test {
  CoinChange2 classUnderTest = new CoinChange2();

  @Test
  public void testInput1(){
    int result = classUnderTest.change(5, new int[]{1,2,5});
    assertEquals(4, result);
  }

  @Test
  public void testInput2(){
    int result = classUnderTest.change(3, new int[]{2});
    assertEquals(0, result);
  }
}
