package com.leetcode.java.linkedlist;

import com.leetcode.java.linkedlist.utils.ListNode;

public class SwapNodesInPairs {
  public ListNode swapPairs(ListNode head) {
    if(head == null || head.next == null){
      return head;
    }

    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode prev = dummy;
    ListNode curr = head;

    while(curr != null && curr.next != null){
      ListNode tmp = curr.next.next;

      prev.next = curr.next;
      prev.next.next = curr;
      curr.next = tmp;
     
      prev = curr;
      curr = curr.next;
    }
    
    return dummy.next;
  }
}
