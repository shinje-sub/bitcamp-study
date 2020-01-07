package com.eomcs.oop.ex08.test;
// public이 붙으면 클래스명과 소스파일명이 같아야한다.
// public이 없으면 class명이 달라도 상관 없다.
// class 안에 선언되는 클래스를 nested class라한다.

// package member class
class A1 {
  
  
}
// package member class
class A2 {
  
}

// package member class
public class A {
  
  // nested class
  // => non-static nested class = inner class
  class X{}
  
  // => static nested class
  static class X2 {}
  
  void m() {
    // local class
    class Y {}
    
    
    // obj를 상속 받은 익명 클래스 만들기
    // anonymous(익명)class
    Object obj = new  Object() {
      @Override
      public String toString() {
        return "익명클래스";
      }
    };
    
    
  }
  
}
