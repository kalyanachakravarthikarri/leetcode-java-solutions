package com.leetcode.java.dp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberOfLISTest {
  NumberOfLIS classUnderTest = new NumberOfLIS();

  @Test
  public void testInput1(){
    int result = classUnderTest.findNumberOfLIS(new int[]{1,3,5,4,7});
    assertEquals(2, result);
  }

  @Test
  public void testInput2(){
    int result = classUnderTest.findNumberOfLIS(new int[]{2,2,2,2,2});
    assertEquals(5, result);
  }

  @Test
  public void testInput3(){
    int result = classUnderTest.findNumberOfLIS(new int[]{3,1,2});
    assertEquals(1, result);
  }
}
