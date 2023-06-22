package com.leetcode.java.graphs;

public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
      if(grid == null || grid.length == 0){
        return 0;
      }

      int maxArea = 0, currentArea = 0;
      int m = grid.length, n = grid[0].length;
      for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
          if(grid[i][j] == 1){
            currentArea = getArea(grid, i, j);
            maxArea = maxArea > currentArea ? maxArea : currentArea;
          }
        }
      }
      return maxArea;    
    }

    private int getArea(int[][] grid, int m, int n){
      if(m <0 || n < 0 || m >= grid.length || n >= grid[0]. length || grid[m][n] == 0) return 0;
      grid[m][n] = 0;
      return 1 + getArea(grid, m+1, n) + getArea(grid, m, n+1) + getArea(grid, m, n-1) + getArea(grid, m-1, n);

    }
}
