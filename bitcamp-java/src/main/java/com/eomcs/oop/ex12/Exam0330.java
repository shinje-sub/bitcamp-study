// 아규먼트에 람다(lambda) 활용 II - 파라미터와 리턴 값이 있는 람다 만들기
package com.eomcs.oop.ex12;

// 람다(lambda) 문법
public class Exam0330 {

  static interface Calculator {
    int compute(int start, int end);
  }

  static void test(Calculator c) {
    System.out.printf("결과 : %d\n", c.compute(1, 10));
  }

  public static void main(String[] args) {
    test((a, b) -> {
      int sum = 0;
      for (int i = 0; i <= b; i++) {
        sum += i;
      }
      return sum;

    });

  }

}


