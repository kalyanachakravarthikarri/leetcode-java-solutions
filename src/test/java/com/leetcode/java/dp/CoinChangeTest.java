package com.leetcode.java.dp;

import static org.junit.Assert.*;

import org.junit.Test;

public class CoinChangeTest {
  CoinChange classUnderTest = new CoinChange();

  @Test
  public void testInput1(){
    int result = classUnderTest.coinChange(new int[]{1,2,5}, 11);
    assertEquals(3, result);
  }

  @Test
  public void testInput2(){
    int result = classUnderTest.coinChange(new int[]{2}, 1);
    assertEquals(-1, result);
  }

  @Test
  public void testInput3(){
    int result = classUnderTest.coinChange(new int[]{1}, 0);
    assertEquals(0, result);
  }
}
