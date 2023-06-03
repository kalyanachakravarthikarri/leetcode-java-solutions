package com.leetcode.java.dp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromicSubstringsTest {
  PalindromicSubstrings classUnderTest = new PalindromicSubstrings();

  @Test
  public void testInput1(){
    int result = classUnderTest.countSubstrings("abc");
    assertEquals(3, result);
  }

  @Test
  public void testInput2(){
    int result = classUnderTest.countSubstrings("aaa");
    assertEquals(6, result);
  }
}
