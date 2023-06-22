package com.leetcode.java.graphs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxAreaOfIslandTest {
   MaxAreaOfIsland classUnderTest = new MaxAreaOfIsland();

  @Test
  public void testInput1() {
    int result = classUnderTest.maxAreaOfIsland(new int[][]{{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}});
    assertEquals(6, result);
  }

  @Test
  public void testInput2() {
    int result = classUnderTest.maxAreaOfIsland(new int[][]{{0,0,0,0,0,0,0,0}});
    assertEquals(0, result);
  }
}
