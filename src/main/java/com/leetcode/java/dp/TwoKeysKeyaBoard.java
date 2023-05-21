package com.leetcode.java.dp;

public class TwoKeysKeyaBoard {
  public int minSteps(int n) {
    if(n <= 0){
      return n;
    }
    return minSteps(n, 1, 0);
  }

  private int minSteps(int n, int currentSize, int lengthOfClipboard){
    if(n == currentSize){
      return 0;
    }

    if(currentSize > n){
      return 5000;
    }

    if(lengthOfClipboard > 0){
      return Math.min(2+ minSteps(n, 2*currentSize, currentSize), 1+minSteps(n, currentSize+lengthOfClipboard, lengthOfClipboard));
    }else{
      return 2+ minSteps(n, 2*currentSize, currentSize);
    }
  }
}
