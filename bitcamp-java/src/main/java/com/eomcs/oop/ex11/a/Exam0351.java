// local class - 로컬 클래스와 로컬 변수
package com.eomcs.oop.ex11.a;

public class Exam0351 {

  public static void main(final String[] args) {
    final Exam0351 obj = new Exam0351();
    obj.m1();
  }


  void m1() {
    int a; // 로컬 변수
    a = 100;

    class A {
      void m1() {
        // final로 선언되어 있지 않더라도 값이 한 번만 할당된 경우
        // 메서드의 로컬 변수를 사용할 수 있다.
        System.out.println(a);
      }
    }

    final A obj = new A();
    obj.m1();
  }

}
