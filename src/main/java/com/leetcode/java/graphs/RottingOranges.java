package com.leetcode.java.graphs;

public class RottingOranges {

  public int orangesRotting(int[][] grid) {
    if (grid == null) {
      return -1;
    }

    int maxRow = grid.length;
    int maxCol = grid[0].length;

    for (int i = 0; i < maxRow; i++) {
      for (int j = 0; j < maxCol; j++) {
        if (grid[i][j] == 2) {
          dfs(grid, i, j, 2);
        }
      }
    }

    int maxTime = 2;
    for (int i = 0; i < maxRow; i++) {
      for (int j = 0; j < maxCol; j++) {
        if (grid[i][j] == 1) {
          return -1;
        }
        maxTime = Math.max(maxTime, grid[i][j]);
      }
    }

    return maxTime-2;
  }

  private void dfs(int[][] grid, int i, int j, int t) {
    int maxRow = grid.length;
    int maxCol = grid[0].length;

    if (i < 0 || i >= maxRow || j < 0 || j >= maxCol || grid[i][j] == 0 || grid[i][j] > 1 && grid[i][j] < t) {
      return;
    }

    grid[i][j] = t;
    dfs(grid, i + 1, j, t + 1);
    dfs(grid, i - 1, j, t + 1);
    dfs(grid, i, j + 1, t + 1);
    dfs(grid, i, j - 1, t + 1);
  }

}
