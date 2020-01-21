// 아규먼트에 람다(lambda) 활용 II - 파라미터와 리턴 값이 있는 람다 만들기
package com.eomcs.oop.ex12;

public class Exam0321 {

  static interface Calculator {
    int compute(int a, int b);
  }

  static void test(Calculator c) {
    System.out.printf("결과 : %d\n", c.compute(200, 100));
  }

  public static void main(String[] args) {
    test((a, b) -> a + b);
    test((a, b) -> a * b);
  }
}


