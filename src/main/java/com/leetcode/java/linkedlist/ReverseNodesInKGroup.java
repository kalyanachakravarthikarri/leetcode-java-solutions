package com.leetcode.java.linkedlist;

import com.leetcode.java.linkedlist.utils.ListNode;

public class ReverseNodesInKGroup {
  public ListNode reverseKGroup(ListNode head, int k) {
    //handle null and single noded lists
    if(head == null || head.next == null){
        return head;
    }
    //Declarations
    ListNode curr = head;
    ListNode prev = null;
    ListNode temp = null;
    //check if next block has k elements
    for(int i=0; i<k; i++){
      if(curr == null){
        return head;
      }
      curr = curr.next;
    }
    //Reverse K nodes
    curr = head;
    for(int i=0; i<k && curr != null; i++){
      temp = curr.next;
      curr.next = prev;
      prev = curr;
      curr = temp;
    }
    //Set the last node in current block to first node in next block
    head.next = reverseKGroup(curr, k);
    //return result
    return prev;
  }return prev;
  }
}
