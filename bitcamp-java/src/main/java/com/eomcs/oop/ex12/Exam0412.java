// 람다(lambda) 문법
package com.eomcs.oop.ex12;

public class Exam0412 {

  static interface Interest {
    double compute(int money);
  }

  static Interest getInterset(final double rate) {
    // 익명 클래스
    Interest i = new Interest() {
      @Override
      public double compute(int money) {
        return money + (money * rate / 100);
      }
    };
    // 또한 개발자는 메서드의 로컬 변수 값을
    // 로컬 클래스의 생성자에 전달하기 위해 직접 작성할 필요가 없다.
    // 컴파일러가 자동으로 추가한다.
    //
    return i;
  }

  public static void main(String[] args) {
    Interest i1 = getInterset(1.5);
    System.out.printf("합계 : %.1f\n", i1.compute(10_0000_0000));

    Interest i2 = getInterset(2.5);
    System.out.printf("합계 : %.1f\n", i2.compute(10_0000_0000));
  }
}


