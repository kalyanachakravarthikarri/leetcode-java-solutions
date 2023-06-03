package com.leetcode.java.dp;

public class PalindromicSubstrings {
  public int countSubstrings(String s) {
    if(s == null || s.length() == 0){
      return 0;
    }
    int result = s.length();
    for(int i=0; i<s.length(); i++){
      int j = i, k = i+1;
      while(j >=0 && k < s.length()){
        if(s.charAt(j--) == s.charAt(k++)){
          result++;
        }else{
          break;
        }
      }
      j = i-1; k = i+1;
      while(j >=0 && k < s.length()){
        if(s.charAt(j--) == s.charAt(k++)){
          result++;
        }else{
          break;
        }
      }
    }
    return result;
  }
}
