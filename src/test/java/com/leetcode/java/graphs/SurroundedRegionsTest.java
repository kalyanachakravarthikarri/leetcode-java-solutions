package com.leetcode.java.graphs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SurroundedRegionsTest {
  SurroundedRegions classUnderTest = new SurroundedRegions();

  @Test
  public void testInput1() {
    char[][] board = new char[][] {
        { 'X', 'X', 'X', 'X' },
        { 'X', 'O', 'O', 'X' },
        { 'X', 'X', 'O', 'X' },
        { 'X', 'O', 'X', 'X' } };

    System.out.println(board[3][1]);
    classUnderTest.solve(board);
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        if (i == 3 && j == 1) {
          assertEquals(i+"_"+j,'O', board[i][j]);
        } else {
          assertEquals(i+"_"+j,'X', board[i][j]);
        }
      }
    }
  }

  @Test
  public void testInput2() {
    char[][] board = new char[][] { { 'X' } };
    classUnderTest.solve(board);
    assertEquals('X', board[0][0]);
  }

  @Test
  public void testInput3() {
    char[][] board = new char[][] {{'O','O','O'},{'O','O','O'},{'O','O','O'}};
    classUnderTest.solve(board);
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        assertEquals(i+"_"+j,'O', board[i][j]);
      }
    }
  }
}
