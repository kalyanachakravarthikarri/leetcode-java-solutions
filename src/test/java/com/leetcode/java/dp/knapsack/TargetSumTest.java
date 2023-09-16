package com.leetcode.java.dp.knapsack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.leetcode.java.dp.knapsack.TargetSum;

public class TargetSumTest {

  TargetSum classUnderTest = new TargetSum();

  @Test
  public void testInput1(){
    int result = classUnderTest.findTargetSumWays(new int[]{1,1,1,1,1}, 3);
    assertEquals(5, result);
  }

  @Test
  public void testInput2(){
    int result = classUnderTest.findTargetSumWays(new int[]{1}, 1);
    assertEquals(1, result);
  }
}
