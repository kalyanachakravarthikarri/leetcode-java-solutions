package com.leetcode.java.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseSchedule {
  public boolean canFinish(int numCourses, int[][] prerequisites) {
        
    Map<Integer, List<Integer>> adjacencyList = new HashMap<>(numCourses);
    for(int i=0; i<numCourses; i++){
      adjacencyList.put(i, new ArrayList<Integer>());
    }
    
    for(int[] prereq : prerequisites){
      adjacencyList.get(prereq[1]).add(prereq[0]);
    }

    int[] visited = new int[numCourses];
    
    for(int i=0; i<numCourses; i++){
      if(visited[i] == 0 && !dfs(adjacencyList, visited, i)) return false;
    }    
    return true;
  }

  private boolean dfs(Map<Integer, List<Integer>> adj, int[] visited, int i){
    if(visited[i] == 1) return false;
    visited[i] = 1;

    for(int ad : adj.get(i)){
      if(!dfs(adj, visited, ad)) return false;
    }
    visited[i] = 2;
    return true;
  }
}
