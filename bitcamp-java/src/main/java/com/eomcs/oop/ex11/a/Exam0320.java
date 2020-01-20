// local class와 파일명 .class 파일명
package com.eomcs.oop.ex11.a;

public class Exam0320 {

  void m0() {
    //
  }

  void m1() {
    // 로컬 클래스를 컴파일 하면 다음 규칙에 따라 .class 파일의 이름이 결정된다.
    // => [바깥 클래스명][$번호][로컬 클래스명].class
    // 예) Exam0310$1A.class
    // => $ 다음에 오는 번호는 로컬 클래스를 갖고 있는 메서드에 선수대로 붙인 번호이다.
    // 예) Exam0310$1A.class
    // => $ 다음에 오는 번호는 로컬 클래스가 등장한 번호이다.
    // => 로컬 클래스가 어떤 메서드 안에 정의된 것인지는 구분하지 않는다.
    // => 1번부터 시작해서 같은 이름의 클래스가 또 등장하면 2번으로 번호가 증가한다.
    class A { // 예) Exam0320$1A.class
    }

    class B { // 예) Exam0320$1B.class
    }
    // 로컬 클래스는 그 클래스가 정의되어 있는 메서드 안에서만 사용할 수 있다.
    new A();
    new B();
  }


  void m2() {
    class A { // 예) Exam0320$2A.class

    }
    new A();
  }

}

