package com.bitcamp.myproject.Algorithmus;



class Solution {

  public static void main(String[] args) {

    System.out.println();
  }

  public static long solution(int a, int b) {
    // -천만 ~ 천만

    long max = Math.max(a, b);
    long min = Math.min(a, b);
    long sum = 0;
    for (long i = min; i <= max; i++) {
      sum += i;
    }
    return sum;
  }

}
