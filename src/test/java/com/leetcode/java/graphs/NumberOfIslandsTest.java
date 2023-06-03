package com.leetcode.java.graphs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberOfIslandsTest {
  NumberOfIslands classUnderTest = new NumberOfIslands();

  @Test
  public void testInput1(){
    int result = classUnderTest.numIslands(new char[][]{
      {'1','1','1','1','0'},
      {'1','1','0','1','0'},
      {'1','1','0','0','0'},
      {'0','0','0','0','0'}});
    assertEquals(1, result);
  }

  @Test
  public void testInput2(){
    int result = classUnderTest.numIslands(new char[][]{
      {'1','1','0','0','0'},
      {'1','1','0','0','0'},
      {'0','0','1','0','0'},
      {'0','0','0','1','1'}});
    assertEquals(3, result);
  }
}
