package com.leetcode.java.dp;

import static org.junit.Assert.*;

import org.junit.Test;

public class PartitionEqualSubsetSumTest {

  PartitionEqualSubsetSum classUnderTest = new PartitionEqualSubsetSum();

  @Test
  public void testInput1(){
    boolean result = classUnderTest.canPartition(new int[]{1,5,11,5});
    assertTrue(result);
  }

  @Test
  public void testInput2(){
    boolean result = classUnderTest.canPartition(new int[]{1,2,3,5});
    assertFalse(result);
  }

  @Test
  public void testInput3(){
    boolean result = classUnderTest.canPartition(new int[]{1,2,5});
    assertFalse(result);
  }
}
