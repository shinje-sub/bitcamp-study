package com.eomcs.oop.ex02.study;

public class Test02 {
  public static void main(String[] args) {
    // 식1: 2 + 3 - 1 * 7 / 3 = ?
    // 식2: 3 * 2 + 7 / 4 - 5 = ?

    // 메서드를 호출할 때 어떤 result 변수에 그 계산 결과를 저장할 것인지,
    // 파라미터로 인스턴스 주소를 넘겨야 한다.
    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();

    c1.plus(2); // 식1
    c2.plus(3); // 식2

    c1.plus(3); // 식1
    c2.multple(2); // 식2

    c1.minus(1); // 식1
    c2.plus(7); // 식7

    c1.multple(7); // 식1
    c2.divide(4); // 식2

    c1.divide(3); // 식1
    c2.minus(5); // 식2

    System.out.printf("식 1의결과: %d\n",c1.result);
    System.out.printf("식 2의결과: %d\n",c2.result);

  }
}