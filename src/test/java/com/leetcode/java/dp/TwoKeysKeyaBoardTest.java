package com.leetcode.java.dp;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoKeysKeyaBoardTest {
  TwoKeysKeyaBoard classUnderTest = new TwoKeysKeyaBoard();

  @Test
  public void testInput1(){
    int result = classUnderTest.minSteps(3);
    assertEquals(3, result);
  } 

  @Test
  public void testInput2(){
    int result = classUnderTest.minSteps(1);
    assertEquals(0, result);
  }
}
