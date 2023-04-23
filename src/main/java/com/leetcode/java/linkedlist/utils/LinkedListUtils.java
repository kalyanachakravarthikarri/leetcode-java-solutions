package com.leetcode.java.linkedlist.utils;

public class LinkedListUtils {
  public static ListNode convertArrayToList(int[] arr) {
    if (arr == null || arr.length == 0) {
      return null;
    }

    ListNode result = null;
    ListNode current = result;
    for(int i : arr){
      if(current == null){
        current = new ListNode(i);
        result = current;
      }else{
        current.next = new ListNode(i);
        current = current.next;
      }
    }
    return result;
  }
}
