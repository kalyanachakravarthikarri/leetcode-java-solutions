package com.leetcode.java.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.leetcode.java.linkedlist.utils.LinkedListUtils;
import com.leetcode.java.linkedlist.utils.ListNode;

public class RemoveDuplicatesFromSortedList2Test {

  private RemoveDuplicatesFromSortedList2 classUnderTest = new RemoveDuplicatesFromSortedList2();

  @Test
  public void testInput1() {
    ListNode node = LinkedListUtils.convertArrayToList(new int[]{1,2,3,3,4,4,5});
    ListNode result = classUnderTest.deleteDuplicates(node);
    assertNotNull(result);
    assertEquals(1, result.val);
    assertEquals(2, result.next.val);
    assertEquals(5, result.next.next.val);
    assertNull(null, result.next.next.next);
  }

  @Test
  public void testInput2() {
    ListNode node = LinkedListUtils.convertArrayToList(new int[]{1,1,1,2,3});
    ListNode result = classUnderTest.deleteDuplicates(node);
    assertNotNull(result);
    assertEquals(2, result.val);
    assertEquals(3, result.next.val);
    assertNull(result.next.next);
  }

  @Test
  public void testInput3() {
    ListNode node = LinkedListUtils.convertArrayToList(new int[]{1,2,2});
    ListNode result = classUnderTest.deleteDuplicates(node);
    assertNotNull(result);
    assertEquals(1, result.val);
    assertNull(result.next);
  }
}
