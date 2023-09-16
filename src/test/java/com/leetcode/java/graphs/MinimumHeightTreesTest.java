package com.leetcode.java.graphs;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class MinimumHeightTreesTest {
    MinimumHeightTrees classUnderTest = new MinimumHeightTrees();

  @Test
  public void testInput1(){
    List<Integer> result = classUnderTest.findMinHeightTrees(4, new int[][]{{1,0},{1,2},{1,3}});
    assertEquals(1, result.size());
    assertEquals(1, result.get(0).intValue());
  }

  @Test
  public void testInput2(){
    List<Integer> result = classUnderTest.findMinHeightTrees(6, new int[][]{{3,0},{3,1},{3,2},{3,4},{5,4}});
    assertEquals(2, result.size());
    assertEquals(3, result.get(0).intValue());
    assertEquals(4, result.get(1).intValue());
  }
}
