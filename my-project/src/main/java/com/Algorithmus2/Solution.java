package com.Algorithmus2;

// 문자열 다루기 기본

// 문제 설명
// 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
// 예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.
//
// 제한 사항
// s는 길이 1 이상, 길이 8 이하인 문자열입니다.

// 2020 04 12 알고리즘 문제

public class Solution {

  public static void main(String[] args) {

  }

  public static boolean solution(String s) {

    return s.matches("^[0-9] {4}|{6}$");
  }
}
