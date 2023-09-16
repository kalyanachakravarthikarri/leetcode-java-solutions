package com.leetcode.java.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloneGraph {

  Map<Node, Node> srcToDest = new HashMap<>(0);

  public Node cloneGraph(Node node) {
    if(node == null) return null;

    return cloneGraphInternal(node);
  }


  private Node cloneGraphInternal(Node node) {
    if (srcToDest.containsKey(node)) {
      return srcToDest.get(node);
    }

    Node cloned = new Node(node.val);
    srcToDest.put(node, cloned);
    for (Node neighbor : node.neighbors) {
      cloned.neighbors.add(cloneGraphInternal(node));
    }
    return cloned;
  }

}

class Node {
  public int val;
  public List<Node> neighbors;

  public Node() {
    val = 0;
    neighbors = new ArrayList<Node>();
  }

  public Node(int _val) {
    val = _val;
    neighbors = new ArrayList<Node>();
  }

  public Node(int _val, ArrayList<Node> _neighbors) {
    val = _val;
    neighbors = _neighbors;
  }
}
