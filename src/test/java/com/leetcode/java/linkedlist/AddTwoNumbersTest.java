package com.leetcode.java.linkedlist;

import static org.junit.Assert.*;
import org.junit.Test;

public class AddTwoNumbersTest {

  private AddTwoNumbers classUnderTest = new AddTwoNumbers();

  @Test
  public void TestSingleNodedList() {
    ListNode node1 = new ListNode(2);
    ListNode node2 = new ListNode(2);
    assertEquals(classUnderTest.addTwoNumbers(node1, node2).val, 4);
  }

  @Test
  public void TestSingleNodedListWithCarry() {
    ListNode node1 = new ListNode(6);
    ListNode node2 = new ListNode(7);
    ListNode result = classUnderTest.addTwoNumbers(node1, node2);
    assertNotNull("Result is not null", result);
    assertTrue("result has two nodes", result.next != null);
    assertEquals(3, result.val);
    assertEquals(1, result.next.val);
  }

  @Test
  public void TestMultiNodeList() {
    ListNode node1 = convertArrayToList(new int[]{2, 4, 3});
    ListNode node2 = convertArrayToList(new int[]{5,6,4});
    ListNode result = classUnderTest.addTwoNumbers(node1, node2);
    assertNotNull("Result is not null", result);
    assertTrue("result has two nodes", result.next != null);
    assertEquals(7, result.val);
    assertEquals(0, result.next.val);
    assertEquals(8, result.next.next.val);
    assertEquals(result.next.next.next, null);
  }

  @Test
  public void TestMultiNodeList2() {
    ListNode node1 = convertArrayToList(new int[]{9,9,9,9,9,9,9});
    ListNode node2 = convertArrayToList(new int[]{9,9,9, 9});
    ListNode result = classUnderTest.addTwoNumbers(node1, node2);
    assertNotNull("Result is not null", result);
    assertTrue("result has two nodes", result.next != null);
    assertEquals(8, result.val);
    assertEquals(9, result.next.val);
    assertEquals(9, result.next.next.val);
    assertEquals(9, result.next.next.next.val);
    assertEquals(0, result.next.next.next.next.val);
    assertEquals(0, result.next.next.next.next.next.val);
    assertEquals(0, result.next.next.next.next.next.next.val);
    assertEquals(1, result.next.next.next.next.next.next.next.val);

    assertEquals(result.next.next.next.next.next.next.next.next, null);
  }

  private ListNode convertArrayToList(int[] arr) {
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