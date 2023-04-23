package com.leetcode.java.linkedlist;

import com.leetcode.java.linkedlist.utils.ListNode;

public class AddTwoNumbers {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
    ListNode current = dummy;
    int sum = 0, carry = 0;

    while (l1 != null || l2 != null || carry > 0) {
      sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
      carry = sum/10;
      sum %= 10;
      current.next = new ListNode(sum);
      current = current.next;
      l1 = l1 != null ? l1.next : l1;
      l2 = l2 != null ? l2.next : l2;
    }

    return dummy.next;
  }
}
