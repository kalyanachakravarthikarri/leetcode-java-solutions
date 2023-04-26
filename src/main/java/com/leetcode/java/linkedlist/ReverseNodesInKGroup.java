package com.leetcode.java.linkedlist;

import com.leetcode.java.linkedlist.utils.ListNode;

public class ReverseNodesInKGroup {
  public ListNode reverseKGroup(ListNode head, int k) {
    if (head == null || k <= 1) {
      return head;
    }

    ListNode current = head;
    ListNode next = null;
    ListNode prev = null;

    int count = 0;

    /*Don't alter the list in case we have less than k elements */
    for(int i=0; i<k; i++){
      if(current == null){
        return head;
      }
      current = current.next;
      prev = current;
    }

    current = head;
    prev = null;

    /* Reverse first k nodes of linked list */
    while (count < k && current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
      count++;
    }

    /*
     * next is now a pointer to (k+1)th node
     * Recursively call for the list starting from
     * current. And make rest of the list as next of
     * first node
     */
    if (next != null)
      head.next = reverseKGroup(next, k);

    // prev is now head of input list
    return prev;
  }
}
