package com.leetcode.java.linkedlist;

import java.util.HashMap;
import java.util.Map;

import com.leetcode.java.linkedlist.utils.ListNode;

public class RemoveDuplicatesFromSortedList2 {
  public ListNode deleteDuplicatesUsingMap(ListNode head) {
    // handle null and single noded list
    if (head == null) {
      return null;
    }
    ListNode curr = head;
    ListNode result = new ListNode(-1);
    ListNode curr_dest = result;
    Map<Integer, Integer> frequency = new HashMap<>();
    // populate frequency map
    while (curr != null) {
      frequency.put(curr.val, frequency.getOrDefault(curr.val, 0) + 1);
      curr = curr.next;
    }
    curr = head;
    // set the nodes to result
    while (curr != null) {
      if (frequency.get(curr.val) == 1) {
        curr_dest.next = new ListNode(curr.val);
        curr_dest = curr_dest.next;
      }
      curr = curr.next;
    }
    // return result
    return result.next;
  }

  public ListNode deleteDuplicates(ListNode head) {
    if (head == null)
      return null;

    ListNode ans = new ListNode();
    ans.next = head;

    ListNode ptr = ans;

    while (ptr.next != null && ptr.next.next != null) {

      if (ptr.next.val == ptr.next.next.val) {
        int value = ptr.next.val;
        while (ptr.next != null && ptr.next.val == value) {
          ptr.next = ptr.next.next;
        }
      } else {
        ptr = ptr.next;
      }
    }
    return ans.next;
  }
}