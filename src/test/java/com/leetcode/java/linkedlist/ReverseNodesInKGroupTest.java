package com.leetcode.java.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import static org.junit.Assert.*;
import org.junit.Test;

import com.leetcode.java.linkedlist.utils.LinkedListUtils;
import com.leetcode.java.linkedlist.utils.ListNode;

public class ReverseNodesInKGroupTest {

  private ReverseNodesInKGroup classUnderTest = new ReverseNodesInKGroup();

  @Test
  public void testInput1(){
    ListNode l = LinkedListUtils.convertArrayToList(new int[]{1,2,3,4,5});
    ListNode result = classUnderTest.reverseKGroup(l, 2);
    assertNotNull(result);
    assertEquals(2, result.val);    
    assertEquals(1, result.next.val);    
    assertEquals(4, result.next.next.val);    
    assertEquals(3, result.next.next.next.val); 
    assertEquals(5, result.next.next.next.next.val);    
    assertNull(result.next.next.next.next.next);
  }
}
