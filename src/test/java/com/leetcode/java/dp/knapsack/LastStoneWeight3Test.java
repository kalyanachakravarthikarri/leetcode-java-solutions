package com.leetcode.java.dp.knapsack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LastStoneWeight3Test {
  LastStoneWeight3 classUnderTest = new LastStoneWeight3();

  @Test
  public void testInput1() {
    int result = classUnderTest.lastStoneWeight3(new int[] { 2, 7, 4, 1, 8, 1 });
    assertEquals(1, result);
  }

  @Test
  public void testInput2() {
    int result = classUnderTest.lastStoneWeight3(new int[] { 31, 26, 33, 21, 40 });
    assertEquals(1, result);
  }
}
