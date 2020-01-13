// Wrapper 클래스 - auto-boxing/auto-unboxing 
package com.eomcs.corelib.ex01;

public class Exam0220 {
  public static void main(String[] args) {
    int i1 = 100;

    // int ==> Integer
    Integer obj1 =  Integer.valueOf(i1);

    // Integer ==> int

    // => auto-boxing 
    //    int 값을 가지고 자동으로 Integer 랩퍼 객체를 만든다. 
    //    이렇게 객체 안에 값을 넣어 포장한다고 해서 "오토박싱"이라 부른다.
    Integer obj2 = Integer.valueOf(200);
    int i2 = obj2.intValue();
   
    Integer obj3 = i1; // 내부적으로 Integer.valueOf(i1)으로 바뀐다.
    // 즉 int 값이 obj3에 저장되는 것이 아니라,
    // 내부적으로 Integer 객체가 생성되어 그 주소가 저장된다.
    // => 이렇게 int 값을 자동으로 Integer 객체로 만드는 것을 "오토박싱(auto-boxing)"이라 한다.
    // JDK1.5부터 auto-boxing, auto-unboxing 기능을 제공한다.

  }
}






