// Reflection API : 중첩 클래스 로딩
package com.eomcs.reflect.ex01;


public class Exam02 {
  static {
    System.out.println("Exam02 로딩됨!");
  }

  static class A {
    static int s_var = 100;
    int i_var = 200;

    static void s_m() {}

    void i_m() {}

    static {
      System.out.println("Exam02의 중첨클래스 A 로딩됨!");
    }
  }

  public static void main(String[] args) throws Exception {
    // => 바깥 클래스가 로딩되었다고 중첩 클래스가 자동으로 로딩되는 것은 아니다.
    //
    // Class clazz = Class.forName("com.eomcs.reflect.ex01.Exam02");

    // Class.forName("com.eomcs.reflect.ex01.Exam02$A");
    // => 중첩 클래스는 "클래스명$중첩클래스명" 형식의 이름을 갖는다.
    // => 중첩 클래스를 로딩하려면 바깥 클래스를 알아야 하기 떄문에
    // 이 경우 바깥 클래스도 로딩된다.
    // Class.forName("com.eomcs.reflect.ex01.Exam02$A");
    // => 이미 바깥 클래스가 로딩되어 있다면 다시 로딩하지 않는다.
    // => 이미 중첩 클래스가 로딩되어 있다면 다시 로딩하지 않는다.
  }

}


