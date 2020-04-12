package com.Algorithmus2;

import java.util.Arrays;

// 나누어 떨어지는 숫자 배열


// 문제 설명
// array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
// divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
//
// 제한 사항
// s는 길이 1 이상, 길이 8 이하인 문자열입니다.

// 2020 04 12 알고리즘 문제


public class Solution2 {

  public static void main(String[] args) {

  }

  public static int[] solution(int[] arr, int divisor) {
    int[] result = Arrays.stream(arr).filter(i -> i % divisor == 0).sorted().toArray();
    return result.length == 0 ? new int[] {-1} : result;
  }
}
