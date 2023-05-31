package com.leetcode.java.dp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DistinctSubsequenceTest {
  private DistinctSubsequence classUnderTest = new DistinctSubsequence();

  @Test
  public void testInput1(){
    int result = classUnderTest.numDistinct("rabbbit", "rabbit");
    assertEquals(3, result);
  }

  @Test
  public void testInput2(){
    int result = classUnderTest.numDistinct("babgbag", "bag");
    assertEquals(5, result);
  }
}
