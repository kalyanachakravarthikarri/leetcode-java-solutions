package com.leetcode.java.linkedlist;

import com.leetcode.java.linkedlist.utils.ListNode;

public class OddEvenLinkedList {
  public ListNode oddEvenList(ListNode head) {
    //handle null list
    if(head == null){
      return null;
    }
    ListNode oddHead = head;
    ListNode oddCurr = oddHead;
    ListNode evenHead = head.next;
    ListNode evenCurr = evenHead;
    while(oddCurr != null && evenCurr != null){
      ListNode nextOdd = evenCurr.next;
      if(nextOdd == null){
        break;
      }
      oddCurr.next = nextOdd;
      oddCurr = oddCurr.next;
      evenCurr.next = oddCurr.next;
      evenCurr = evenCurr.next;
    }
    oddCurr.next = evenHead;
    return oddHead;
  }
}
