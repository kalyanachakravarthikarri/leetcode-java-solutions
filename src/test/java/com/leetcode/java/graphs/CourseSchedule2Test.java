package com.leetcode.java.graphs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CourseSchedule2Test {
  CourseSchedule2 classUnderTest = new CourseSchedule2();

  @Test
  public void testInput1() {
    int[] result = classUnderTest.findOrder(2, new int[][]{{1,0}});
    assertEquals( 2, result.length);
    assertEquals( 0, result[0]);
    assertEquals( 1, result[1]);
  }

  @Test
  public void testInput2() {
    int[] result = classUnderTest.findOrder(4, new int[][]{{1,0}, {2,0}, {3,1}, {3,2}});
    assertEquals( 4, result.length);
    assertEquals( 0, result[0]);
    assertEquals( 2, result[1]);
    assertEquals( 1, result[2]);
    assertEquals( 3, result[3]);
  }
}
