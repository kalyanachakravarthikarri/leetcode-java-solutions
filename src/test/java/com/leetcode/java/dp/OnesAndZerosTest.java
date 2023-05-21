package com.leetcode.java.dp;

import static org.junit.Assert.*;

import org.junit.Test;

public class OnesAndZerosTest {

  OnesAndZeros classUnderTest = new OnesAndZeros();

  @Test
  public void testInput1(){
    int result = classUnderTest.findMaxForm_tabular(new String[]{"10","0001","111001","1","0"}, 5,3);
    assertEquals(4, result);
  } 

  @Test
  public void testInput2(){
    int result = classUnderTest.findMaxForm_tabular(new String[]{"10","0","1"}, 1, 1);
    assertEquals(2, result);
  }

  @Test
  public void testInput3(){
    int result = classUnderTest.findMaxForm_tabular(new String[]{"10","0001","111001","1","0"}, 4, 3);
    assertEquals(3, result);
  }
}
