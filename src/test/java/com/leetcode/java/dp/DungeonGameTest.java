package com.leetcode.java.dp;

import static org.junit.Assert.assertEquals;

//import org.junit.Test;

public class DungeonGameTest {
  DungeonGame classUnderTest = new DungeonGame();

  //@Test
  public void testInput1(){
    int result = classUnderTest.calculateMinimumHP(new int[][]{{2},{3,4},{6,5,7},{4,1,8,3}});
    assertEquals(7, result);
  }

 // @Test
  public void testInput2(){
    int result = classUnderTest.calculateMinimumHP(new int[][]{{0}});
    assertEquals(1, result);
  }
}
