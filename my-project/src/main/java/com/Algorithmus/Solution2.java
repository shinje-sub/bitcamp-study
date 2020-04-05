package com.bitcamp.myproject.Algorithmus;


class Solution2 {

  public static void main(String[] args) {
    System.out.println("abcde");
  }

  public static String solution(String s) {
    // 가운데 글자를 리턴하는 함수
    // 단어의 길이가 짝수면 가운데 두글자 반환
    // - abcdef 길이 : 6 //cd
    // 단어의 길이가 홀수면 가운데 한글자 반환
    // - abcde 길이 : 5 // c
    int slen = s.length(); // 5
    if (slen % 2 == 1) // 5%2 == 1
      return s.charAt(slen / 2) + ""; // 5/2
    return s.substring(slen / 2 - 1, slen / 2 + 1); // (2,4)

  }
}

