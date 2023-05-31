package com.leetcode.java.dp;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EditDistanceTest {
  private EditDistance classUnderTest = new EditDistance();

  @Test
  public void testInput1(){
    int result = classUnderTest.minDistance("horse", "ros");
    assertEquals(result, 3);
  }

  @Test
  public void testInput2(){
    int result = classUnderTest.minDistance("intention", "execution");
    assertEquals(result, 5);
  }

  @Test
  public void testInput3(){
    int result = classUnderTest.minDistance("", "a");
    assertEquals(result, 1);
  }
}
