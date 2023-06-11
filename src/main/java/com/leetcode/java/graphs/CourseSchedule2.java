package com.leetcode.java.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class CourseSchedule2 {
  public int[] findOrder(int numCourses, int[][] prerequisites) {
    Map<Integer, List<Integer>> adjacencyList = new HashMap<>();
    for(int i=0; i<numCourses; i++){
      adjacencyList.put(i, new ArrayList<Integer>());
    }
    
    for(int[] prereq : prerequisites){
      adjacencyList.get(prereq[1]).add(prereq[0]);
    }

    int[] visited = new int[numCourses];
    Stack<Integer> s = new Stack<>();
    for(int i=0; i<numCourses; i++){
      if(isCyclic(adjacencyList, visited, i, s)) return new int[0];
    }

    int[] result = new int[s.size()];
    int i =0;
    while(!s.isEmpty()){
      result[i++] = s.pop();
    }
    return result;     
  }

  private boolean isCyclic(Map<Integer, List<Integer>> adjMap, int[] visited, int index, Stack<Integer> s){
    if(visited[index] == 1) return true;

    visited[index] = 1;
    for(int neighbor : adjMap.get(index)){
      if(isCyclic(adjMap, visited, neighbor, s)) return true;
    }

    visited[index] = 2;
    if(!s.contains(index)){
      s.push(index);
    }
    
    return false;
  }
}
