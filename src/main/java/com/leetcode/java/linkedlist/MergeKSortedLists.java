package com.leetcode.java.linkedlist;

import com.leetcode.java.linkedlist.utils.ListNode;

public class MergeKSortedLists {
  public ListNode mergeKLists(ListNode[] lists) {
    // handle empty list and list with one list
    if (lists == null || lists.length == 0) {
      return null;
    }
    // intialize
    ListNode result = new ListNode(-1);
    ListNode current = result;
    boolean completed = true;
    // iterate until we have traversed all the nodes of all the lists
    while (true) {
      int nextIndex = -1, nextVal = Integer.MAX_VALUE;
      completed = true;
      // find next least value among all the lists
      for (int i = 0; i < lists.length; i++) {
        if (lists[i] != null) {
          completed = false;
          if (nextVal > lists[i].val) {
            nextIndex = i;
            nextVal = lists[i].val;
          }
        }
      }
      // set next node in merged list and advance the input list
      if (nextIndex > -1) {
        current.next = lists[nextIndex];
        current = current.next;
        lists[nextIndex] = lists[nextIndex].next;
      }

      if (completed)
        break;
    }
    // return result
    return result.next;
  }
}
