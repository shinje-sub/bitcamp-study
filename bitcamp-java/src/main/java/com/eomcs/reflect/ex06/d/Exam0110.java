package com.eomcs.reflect.ex06.d;

import java.lang.reflect.Proxy;

// 값을 리턴하는 방법
public class Exam0110 {
  public static void main(String[] args) {


    MyInterface obj = (MyInterface) Proxy.newProxyInstance(//
        Exam0110.class.getClassLoader(), // 클래스를 생성하고 메모리에 로딩 할 객체
        new Class[] {MyInterface.class}, // 자동 생성할 클래스가 구현해야 하는 인터페이스 목록
        new MyInvocationHandler());

    System.out.println(obj.m1(100, 200));
    System.out.println(obj.m2("홍길동", 20));
  }
}
