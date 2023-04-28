package com.leetcode.java.linkedlist;

import com.leetcode.java.linkedlist.utils.ListNode;

public class MergeKSortedLists {
  public ListNode mergeKLists(ListNode[] lists) {
    if(lists == null || lists.length == 0){
        return null;
    }
    ListNode result = new ListNode(-1);
    ListNode current = result;
    boolean completed = true;
    while (true) {
      int nextListIndex = -1, nextSmallestNode = Integer.MAX_VALUE;
      completed = true;
      for(int i=0; i<lists.length; i++){
        if(lists[i] != null){
          completed = false;
          if(lists[i].val <= nextSmallestNode){          
            nextSmallestNode = lists[i].val;
            nextListIndex = i;
          }
        }
      }
      if(nextListIndex > -1){
        current.next = lists[nextListIndex];
        current = current.next;
        lists[nextListIndex] = lists[nextListIndex].next; 
      }

      if(completed) break;
    }
    return result.next;
  }
}
