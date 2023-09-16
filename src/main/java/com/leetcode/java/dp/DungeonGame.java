package com.leetcode.java.dp;

public class DungeonGame {
  public int calculateMinimumHP(int[][] dungeon) {
    return calculateMinimumHP(dungeon, dungeon.length, dungeon[0].length);
    
  }

  private int calculateMinimumHP(int[][] dungeon, int m, int n){
    if(m == dungeon.length - 1 && n == dungeon[0].length){
      return dungeon[m][n] > 0 ? 1 : 1-dungeon[m][n];
    }

    return Math.max(dungeon[m-1][n] + calculateMinimumHP(dungeon, m-1, n),
    dungeon[m][n-1] + calculateMinimumHP(dungeon, m, -1));

  }
}
