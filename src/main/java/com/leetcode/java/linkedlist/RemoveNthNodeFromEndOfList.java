package com.leetcode.java.linkedlist;

public class RemoveNthNodeFromEndOfList {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    if(n <= 0){
      return null;
    }
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode slow = head;
    ListNode fast = head;
    for(int i=0; i<n; i++){
      if (fast == null) {
        return head;
      }
      fast = fast.next;
    }

    if(fast == null){
      dummy.next = dummy.next.next;
      return dummy.next;
    }
    while(fast.next != null){
      fast = fast.next;
      slow = slow.next;
    }
    slow.next = slow.next != null ? slow.next.next : null;
    return dummy.next;
  }
}
