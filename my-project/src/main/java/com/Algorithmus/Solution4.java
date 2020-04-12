package com.Algorithmus;

public class Solution4 {
  // 자연수 N이 주어지면 N의 각 자릿수 합을 구해서 return 하는 함수 만들기
  // N = 123이면 1 + 2 + 3 = 6

  public int solution(int n) {
    String value = String.valueOf(n);
    int answer = 0;
    for (int i = 0; i < value.length(); i++) {
      char ch = value.charAt(i);
      answer += (ch - 48);
    }
    return answer;
  }
}
