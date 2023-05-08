package com.leetcode.java.linkedlist;

import com.leetcode.java.linkedlist.utils.ListNode;

public class DeleteNodeInLinkedList {
  public void deleteNode(ListNode node) {
    if(node == null){
      return;
    }
    ListNode prev = null;
    while (node.next != null) {
      node.val = node.next.val;
      prev = node;
      node = node.next;
    }
    prev.next = null;
  }
}
