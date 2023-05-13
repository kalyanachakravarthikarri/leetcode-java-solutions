package com.leetcode.java.dp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class GenerateParanthesisTest {

  private GenerateParanthesis classUnderTest = new GenerateParanthesis();

  @Test
  public void testInput1(){
    List<String> result = classUnderTest.generateParenthesis(3);
    assertEquals(result.size(), 5);
    assertTrue(result.contains("((()))"));
    assertTrue(result.contains("(()())"));
    assertTrue(result.contains("(())()"));
    assertTrue(result.contains("()(())"));
    assertTrue(result.contains("()()()"));
  }

  @Test
  public void testInput2(){
    List<String> result = classUnderTest.generateParenthesis(2);
    assertEquals(result.size(), 2);
    assertTrue(result.contains("(())"));
    assertTrue(result.contains("()()"));
  }
  
  @Test
  public void testInput3(){
    List<String> result = classUnderTest.generateParenthesis(1);
    assertEquals(result.size(), 1);
    assertTrue(result.contains("()"));
  }
}
