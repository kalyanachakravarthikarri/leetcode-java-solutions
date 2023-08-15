package com.leetcode.java.graphs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RottingOrangesTest {
  RottingOranges classUnderTest = new RottingOranges();

  @Test
  public void testInput1() {
    int result = classUnderTest.orangesRotting(new int[][]{{2,1,1}, {1,1,0}, {0,1,1}});
    assertEquals( 4, result);
  }

  @Test
  public void testInput2() {
    int result = classUnderTest.orangesRotting(new int[][]{{2,1,1},{0,1,1},{1,0,1}});
    assertEquals( -1, result);
  }

    @Test
  public void testInput3() {
    int result = classUnderTest.orangesRotting(new int[][]{{0,2}});
    assertEquals( 0, result);
  }
}
