package com.Algorithmus2;

import java.util.Stack;


// 문제 설명
// n개의 음이 아닌 정수가 있습니다. 이 수를 적절히 더하거나 빼서 타겟 넘버를 만들려고 합니다.
// 예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.
//
// -1+1+1+1+1 = 3
// +1-1+1+1+1 = 3
// +1+1-1+1+1 = 3
// +1+1+1-1+1 = 3
// +1+1+1+1-1 = 3
//
// 제한 사항
//
// 주어지는 숫자의 개수는 2개 이상 20개 이하입니다.
// 각 숫자는 1 이상 50 이하인 자연수입니다.
// 타겟 넘버는 1 이상 1000 이하인 자연수입니다.
//
public class BFS {

  public static void main(String[] args) {
    System.out.println(solution(new int[] {1, 1, 1, 1, 1}, 3));
  }

  public static int solution(int[] numbers, int target) {

    Stack<Integer> stack = new Stack<>();
    stack.push(0);

    // numbers.length <= 20개
    for (int num : numbers) {
      Stack<Integer> tmp = new Stack<>();
      while (!stack.empty()) {
        int val = stack.pop();
        tmp.push(val + num);
        tmp.push(val - num);
      }
      stack.addAll(tmp);
    }
    return (int) stack.stream().filter(i -> i == target).count();
  }
}
