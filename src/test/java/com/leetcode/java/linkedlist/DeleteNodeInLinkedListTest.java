package com.leetcode.java.linkedlist;

import static org.junit.Assert.*;
import org.junit.Test;

import com.leetcode.java.linkedlist.utils.LinkedListUtils;
import com.leetcode.java.linkedlist.utils.ListNode;

public class DeleteNodeInLinkedListTest {

  private DeleteNodeInLinkedList classUnderTest = new DeleteNodeInLinkedList();

  @Test
  public void testInput1() {
    ListNode node = LinkedListUtils.convertArrayToList(new int[]{4,5,1,9});
    classUnderTest.deleteNode(node.next);
    assertNotNull(node);
    assertEquals(4, node.val);
    assertEquals(1, node.next.val);
    assertEquals(9, node.next.next.val);
    assertNull(node.next.next.next);
  }

  @Test
  public void testInput2() {
    ListNode node = LinkedListUtils.convertArrayToList(new int[]{4,5,1,9});
    classUnderTest.deleteNode(node.next.next);
    assertNotNull(node);
    assertEquals(4, node.val);
    assertEquals(5, node.next.val);
    assertEquals(9, node.next.next.val);
    assertNull(node.next.next.next);
  }
}
