package com.leetcode.java.linkedlist;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;
import org.junit.Test;

import com.leetcode.java.linkedlist.utils.LinkedListUtils;
import com.leetcode.java.linkedlist.utils.ListNode;

public class MergeKSortedListsTest {

  private MergeKSortedLists classUnderTest = new MergeKSortedLists();

  @Test
  public void testInput1(){
    List<ListNode> input = new LinkedList<>();
    input.add(LinkedListUtils.convertArrayToList(new int[]{1,4,5}));
    input.add(LinkedListUtils.convertArrayToList(new int[]{1,3,4}));
    input.add(LinkedListUtils.convertArrayToList(new int[]{2,6}));
    ListNode result = classUnderTest.mergeKLists(input.toArray(new ListNode[0]));
    assertEquals(1, result.val);
    assertEquals(1, result.next.val);
    assertEquals(2, result.next.next.val);
    assertEquals(3, result.next.next.next.val);
    assertEquals(4, result.next.next.next.next.val);
    assertEquals(4, result.next.next.next.next.next.val);
    assertEquals(5, result.next.next.next.next.next.next.val);
    assertEquals(6, result.next.next.next.next.next.next.next.val);
    assertNotNull(result.next.next.next.next.next.next.next.val);
 }

 @Test
 public void testInput2(){
   List<ListNode> input = new LinkedList<>();
   ListNode result = classUnderTest.mergeKLists(input.toArray(new ListNode[0]));
   assertNull(result);
 }

 @Test
 public void testInput3(){
   List<ListNode> input = new LinkedList<>();
   input.add(LinkedListUtils.convertArrayToList(new int[]{}));
   ListNode result = classUnderTest.mergeKLists(input.toArray(new ListNode[0]));
   assertNull(result);
 }

  @Test
  public void testInput4(){
    //[[-2,1,4,5],[-2,5,6],[-2,0]]
    List<ListNode> input = new LinkedList<>();
    input.add(LinkedListUtils.convertArrayToList(new int[]{-2,1,4,5}));
    input.add(LinkedListUtils.convertArrayToList(new int[]{-2,5,6}));
    input.add(LinkedListUtils.convertArrayToList(new int[]{-2,0}));
    ListNode result = classUnderTest.mergeKLists(input.toArray(new ListNode[0]));
    assertEquals(-2, result.val);
    assertEquals(-2, result.next.val);
    assertEquals(-2, result.next.next.val);
    assertEquals(0, result.next.next.next.val);
    assertEquals(1, result.next.next.next.next.val);
    assertEquals(4, result.next.next.next.next.next.val);
    assertEquals(5, result.next.next.next.next.next.next.val);
    assertEquals(5, result.next.next.next.next.next.next.next.val);
    assertEquals(6, result.next.next.next.next.next.next.next.next.val);
    assertEquals(result.next.next.next.next.next.next.next.next.next, null);

  }
}
