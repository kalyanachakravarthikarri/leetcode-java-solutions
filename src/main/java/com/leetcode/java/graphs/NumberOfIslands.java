package com.leetcode.java.graphs;

public class NumberOfIslands {
  public int numIslands(char[][] grid) {

    if(grid == null){
      return 0;
    }
    int result = 0;
    for(int i=0; i<grid.length; i++){
      for(int j=0; j<grid[0].length; j++){
        if(grid[i][j] == '1'){
          result++;
          dfs(grid, i, j);
        }
      }
    }
    return result;
  }

  private void dfs(char[][] grid, int m, int n) {
    if (m < 0 || m >= grid.length || n < 0 || n >= grid[0].length || grid[m][n] == '0') {
      return;
    }
    grid[m][n] = '0';
    dfs(grid, m + 1, n);
    dfs(grid, m, n + 1);
    dfs(grid, m - 1, n);
    dfs(grid, m, n - 1);
  }
}
