package com.leetcode.java.dp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromPartitioning2Test {
  PalindromPartitioning2 classUnderTest = new PalindromPartitioning2();

  @Test
  public void testInput1(){
    int result = classUnderTest.minCut("aab");
    assertEquals(1, result);
  }

  @Test
  public void testInput2(){
    int result = classUnderTest.minCut("a");
    assertEquals(0, result);
  }

  @Test
  public void testInput3(){
    int result = classUnderTest.minCut("ab");
    assertEquals(1, result);
    
  }
}
