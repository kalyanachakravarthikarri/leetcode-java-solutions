package com.leetcode.java.graphs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberOfProvincesTest {
  NumberOfProvinces classUnderTest = new NumberOfProvinces();

  @Test
  public void testInput1() {
    int result = classUnderTest.findCircleNum(new int[][]{{1,1,0},{1,1,0},{0,0,1}});
    assertEquals( 2, result);
  }

  @Test
  public void testInput2() {
    int result = classUnderTest.findCircleNum(new int[][]{{1,0,0},{0,1,0},{0,0,1}});
    assertEquals( 3, result);
  }
}
