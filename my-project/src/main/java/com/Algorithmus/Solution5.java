package com.bitcamp.myproject.Algorithmus;

public class Solution5 {
  // 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인경우 "Odd"를 반환하는 함수 완성하기
  //
  // 제한 조건
  // num은 int 범위의 정수
  // 0은 짝수

  public static String solution(int num) {
    if (num % 2 == 0)
      return "Even";
    return "Odd";

  }
}

