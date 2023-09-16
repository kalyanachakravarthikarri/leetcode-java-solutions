package com.leetcode.java.graphs;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WaterAndJugTest {
  WaterAndJug classUnderTest = new WaterAndJug();

  @Test
  public void testInput1() {
    boolean result = classUnderTest.canMeasureWater(3, 5, 4);
    assertTrue(result);
  }

  @Test
  public void testInput2() {
    boolean result = classUnderTest.canMeasureWater(2, 6, 5);
    assertFalse(result);
  }

  @Test
  public void testInput3() {
    boolean result = classUnderTest.canMeasureWater(1,2, 3);
    assertTrue(result);
  }
}
