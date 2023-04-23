package com.leetcode.java.linkedlist;

import static org.junit.Assert.*;
import org.junit.Test;

public class RemoveNthNodeFromEndOfListTest {

  private static RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();

  /**
   * Input is null
   */
  @Test
  public void testEmptyList() {
    ListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(null, 0);
    assertNull(result);
  }

  @Test
  public void testWithInput1(){
    ListNode node = LinkedListTestUtils.convertArrayToList(new int[]{1,2,3,4,5});
    ListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(node, 2);
    assertNotNull(result);
    assertEquals(1, result.val);
    assertEquals(2, result.next.val);
    assertEquals(3, result.next.next.val);
    assertEquals(5, result.next.next.next.val);
    assertNull(null, result.next.next.next.next);
  }

  @Test
  public void testWithInput2(){
    ListNode node = LinkedListTestUtils.convertArrayToList(new int[]{1});
    ListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(node, 1);
    assertNull(result);
  }

  @Test
  public void testWithInput3(){
    ListNode node = LinkedListTestUtils.convertArrayToList(new int[]{1,2});
    ListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(node, 1);
    assertNotNull(result);
    assertEquals(1, result.val);
    assertNull(null, result.next);
  }

  @Test
  public void testWithInput4(){
    ListNode node = LinkedListTestUtils.convertArrayToList(new int[]{1,2});
    ListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(node, 2);
    assertNotNull(result);
    assertEquals(2, result.val);
    assertNull(null, result.next);
  }

}
