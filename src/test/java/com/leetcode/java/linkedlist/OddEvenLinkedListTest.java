package com.leetcode.java.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.leetcode.java.linkedlist.utils.LinkedListUtils;
import com.leetcode.java.linkedlist.utils.ListNode;

public class OddEvenLinkedListTest {

  private OddEvenLinkedList classUnderTest = new OddEvenLinkedList();

  @Test
  public void testInput1() {
    ListNode node = LinkedListUtils.convertArrayToList(new int[]{1,2,3,4,5});
    ListNode result = classUnderTest.oddEvenList(node);
    assertNotNull(result);
    assertEquals(1, result.val);
    assertEquals(3, result.next.val);
    assertEquals(5, result.next.next.val);
    assertEquals(2, result.next.next.next.val);
    assertEquals(4, result.next.next.next.next.val);
    assertNull(null, result.next.next.next.next.next);
  }

  @Test
  public void testInput2() {
    ListNode node = LinkedListUtils.convertArrayToList(new int[]{2,1,3,5,6,4,7});
    ListNode result = classUnderTest.oddEvenList(node);
    assertNotNull(result);
    assertEquals(2, result.val);
    assertEquals(3, result.next.val);
    assertEquals(6, result.next.next.val);
    assertEquals(7, result.next.next.next.val);
    assertEquals(1, result.next.next.next.next.val);
    assertEquals(5, result.next.next.next.next.next.val);
    assertEquals(4, result.next.next.next.next.next.next.val);
    assertNull(null, result.next.next.next.next.next.next.next);
  }
}
