package com.leetcode.java.dp;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class TriangleTest {
  Triangle classUnderTest = new Triangle();

  @Test
  public void testInput1(){
    int result = classUnderTest.minimumTotal(convertArrayToList(new int[][]{{2},{3,4},{6,5,7},{4,1,8,3}}));
    assertEquals(11, result);
  }

  @Test
  public void testInput2(){
    int result = classUnderTest.minimumTotal(convertArrayToList(new int[][]{{-10}}));
    assertEquals(-10, result);
  }

  private List<List<Integer>> convertArrayToList(int[][] input){
    List<List<Integer>> list = new ArrayList<>();
    for (int[] array : input) {
      List<Integer> temp = new ArrayList<>();
      for(int num : array){
        temp.add(num);
      }
      list.add(temp);
    }
    return list;
  }
}
