// Wrapper 클래스 - auto-boxing/auto-unboxing 
package com.eomcs.corelib.ex01;

public class Exam0222 {
  public static void main(String[] args) {
    int i1 = 100;

    // 자바는 Wrapper 객체의 값을 primitvie data type 변수에 직접 할당할 수 있다.
    Integer obj = 100;
    // obj에 저장된 것은 int 값이 아니라 Intger 객체의 주소인데 어떻게 가능한가?
    // => 내부적으로 obj.inValue()로 바뀐다.
    // => 즉 obj4에 들어있는 인스턴스 주소가 i3에 저장되는 것이 아니라,
    //    obj4 인스턴스에 들어 있는 값을 꺼내 i3에 저장하는 것이다.
    //    이렇게 Wrapper 객체 안에 들어 있는 값을 자동으로 꺼낸다고 해서 
    //    "오토언박싱"이라 부른다.
    //   JDK1.5부터 auto-boxing, auto-unboxing 기능을 제공한다.


  }
}






