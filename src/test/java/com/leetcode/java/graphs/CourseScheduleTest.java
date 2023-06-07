package com.leetcode.java.graphs;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CourseScheduleTest {
 CourseSchedule classUnderTest = new CourseSchedule();

  @Test
  public void testInput1() {
    boolean result = classUnderTest.canFinish(2, new int[][]{{1,0}});
    assertTrue(result);
  }

  @Test
  public void testInput2() {
    boolean result = classUnderTest.canFinish(2, new int[][]{{1,0}, {0,1}});
    assertFalse(result);
  }
}
