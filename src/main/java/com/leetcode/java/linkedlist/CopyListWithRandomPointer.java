package com.leetcode.java.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {
  public Node copyRandomList(Node head) {
    if(head == null){
      return null;
    }
    Node result = new Node(-1);
    Node dest = result;
    Node src = head;
    Map<Node, Node> mappings = new HashMap<>();
    while(src != null){
      dest.next = new Node(src.val);
      dest = dest.next;
      mappings.put(src, dest);
      src = src.next;
    }
    src = head;
    dest = result.next;
    while(src != null){
      dest.random = mappings.get(src.random);
      dest = dest.next;
      src = src.next;
    }

    return result.next;
  } result.next;
  }}

class Node {
  int val;
  Node next;
  Node random;

  public Node(int val) {
    this.val = val;
    this.next = null;
    this.random = null;
  }
}
