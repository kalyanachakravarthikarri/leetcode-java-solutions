package com.leetcode.java.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumHeightTrees {
  public List<Integer> findMinHeightTrees(int n, int[][] edges) {
    List<Integer> result = new ArrayList<Integer>();
    if (n == 0 || edges == null || edges.length == 0) {
      return null;
    }

    Map<Integer, List<Integer>> adjMatrix = new HashMap();
    for (int i = 0; i < n; i++) {
      adjMatrix.put(i, new ArrayList<Integer>());
    }

    for (int[] edge : edges) {
      adjMatrix.get(edge[0]).add(edge[1]);
      adjMatrix.get(edge[1]).add(edge[0]);
    }

    int minHeight = Integer.MAX_VALUE;
    int currentHeight = -1;
    for (int i = 0; i < n; i++) {
      boolean[] visited = new boolean[n];
      currentHeight = findHeight(adjMatrix, visited, i);
      if (currentHeight < minHeight) {
        minHeight = currentHeight;
        result.clear();
        result.add(currentHeight);
      } else if (currentHeight == minHeight) {
        result.add(currentHeight);
      }
    }

    return result;
  }

  private int findHeight(Map<Integer, List<Integer>> adjMatrix, boolean[] visited, int index) {

    visited[index] = true;
    int height = Integer.MIN_VALUE; int currentHeight = 0;
    for (int neighbor : adjMatrix.get(index)) {
      currentHeight = (visited[neighbor] ? 0 : 1+findHeight(adjMatrix, visited, neighbor));
      height = Math.max(currentHeight, height);
    }

    return height;
  }
}
