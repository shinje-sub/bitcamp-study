package com.eomcs.oop.ex02.study;

public class Calculator {
  
  // 계산 결과를 개별적으로 관리하고 싶다면 인스턴스 필드로 선언한다.
  int result; // 따로 정의하지 않아도 자동 초기화 0
  
  // 개별적으로 관리되는 인스턴스 변수 result를 사용하고 싶다면,
  // 파라미터로 인스턴스의 주소를 받아야 한다.
  // 스태틱 메서드에서 인스턴스의 필드나 메서드를 사용할 수 없다.
  // 인스턴스 필드나 인스턴스 메서드를 사용하려면
  // 파라미터로 인스턴스 주소를 받아야 한다. reserved keyword (미리 찜해 놓은 키워드)
   void plus(int value) {
     this.result += value; // result = result + value
  }

  
   void minus(int value) {
    this.result -= value; // result = result - value
  }
  
   void multple(int value) {
    this.result *= value; 
  } 
  
   void divide(int value) {
    this.result /= value;
  }
}