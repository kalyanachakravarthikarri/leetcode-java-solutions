package com.leetcode.java.linkedlist;

import static org.junit.Assert.*;
import org.junit.Test;

import com.leetcode.java.linkedlist.utils.LinkedListUtils;
import com.leetcode.java.linkedlist.utils.ListNode;

public class SwapNodesInPairsTest {

  private SwapNodesInPairs classUnderTest = new SwapNodesInPairs();

  @Test
  public void testSwapNodesInPairsForNullList(){
    ListNode result = classUnderTest.swapPairs(null);
    assertNull(result);
  }

  @Test
  public void testInput1(){
    ListNode l = LinkedListUtils.convertArrayToList(new int[]{1,2,3,4});
    ListNode result = classUnderTest.swapPairs(l);
    assertNotNull(result);
    assertEquals(2, result.val);    
    assertEquals(1, result.next.val);    
    assertEquals(4, result.next.next.val);    
    assertEquals(3, result.next.next.next.val);    
    assertNull(result.next.next.next.next);
  }

  @Test
  public void testInput2(){
    ListNode l = LinkedListUtils.convertArrayToList(new int[]{});
    ListNode result = classUnderTest.swapPairs(l);
    assertEquals(l, result);
  }

  @Test
  public void testInput3(){
    
  }
}
