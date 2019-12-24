package com.eomcs.basic.ex7.test;

public class Test01 {
  public static void main(String[] args) {
    // 입력 값 : X, 리턴 값: X
    m1();

    //입력 값 : 0, 리턴 값: x
    m2("홍길동");

    //입력 값 : x, 리턴값 : 0
    String s;
    s = m3();
    System.out.println(s);
    
    // 입력 값 : 0, 리턴값 : 0
    String s2 = m4("홍길동");
    System.out.println(s2);
  }
  
  static void m1() {
    System.out.println("Hello!");
  }
  
  static void m2(String name) {
    System.out.println("Hello," + name);
    // 함수 안에 선언된 변수를 "로컬(locar) 변수"라 부른다.
    // 로컬 변수 중에서 함수(메서드)가 호출될 때 넘어 온 값을
    // 받는 변수를 "파마미터(parameter)"라 부른다.
    // 함수를 호출할 때 넘겨주는 값을 "아규먼트(argument)"라 부른다.
  }
  
  static String m3() {
    String message = "Hello!";
    return  message;}
    
    static String m4(String name) {
      String message = String.format("%s 님 안녕하세요!", name);
      return message;
      }
    }
  

