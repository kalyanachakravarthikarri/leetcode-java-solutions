package com.leetcode.java.linkedlist;

import java.util.HashMap;
import java.util.Map;

import com.leetcode.java.linkedlist.utils.ListNode;

public class RemoveDuplicatesFromSortedList2 {
  public ListNode deleteDuplicates(ListNode head) {
    // handle null and single noded list
    if (head == null) {
      return null;
    }
    ListNode curr = head;
    ListNode result = new ListNode(-1);
    ListNode res = result;
    Map<Integer, Integer> frequency = new HashMap<>();
    while (curr != null) {
      frequency.put(curr.val, frequency.getOrDefault(curr.val, 0) + 1);
      curr = curr.next;
    }
    curr = head;
    // Iterate over the list
    while (curr != null) {
      if (frequency.get(curr.val) == 1) {
        res.next = new ListNode(curr.val);
        res = res.next;
      }
      curr = curr.next;
    }
    // return result
    return result.next;
  }
}