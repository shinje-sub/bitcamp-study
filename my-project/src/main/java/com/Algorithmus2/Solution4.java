package com.Algorithmus2;

// 소수찾기
//
//
// 문제설명
// 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
//
// 소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
// (1은 소수가 아닙니다.)
//
// 제한 조건
// n은 2이상 1000000이하의 자연수입니다.
//
// 2020 04 12 알고리즘 문제

public class Solution4 {

  public static void main(String[] args) {

  }

  public int solution(int n) {
    boolean[] check = new boolean[n + 1];
    check[0] = check[1] = true;
    for (int i = 2; i * i <= n; i += 1) {
      for (int j = i * i; j <= n; j += i) {
        check[j] = true;
      }
    }

    int res = 0;
    for (boolean b : check)
      if (!b)
        res++;
    return res;
  }
}
