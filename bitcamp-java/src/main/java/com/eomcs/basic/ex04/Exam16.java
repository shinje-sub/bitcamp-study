package com.eomcs.basic.ex04;

public class Exam16 {
  public static void main(String[] args) {
    // 변수의 종류
    // => primitive data type(자바 원시 테이터 타입)
    byte b; // 1바이트 크기를 갖는 메모리 정수값
    short s; // 2
    int i; // 4
    long l; // 8

    float f; // 4 단, 부동소수점 저장
    double d; // 8

    boolean bool; // jvm에서 int 로 취급

    char c; // 2

    // => reference : 다른 메모리의 주소를 저장하는 변수
    String str;
    Thread t; // Thread 정보
    java.sql.Date date;
    java.net.Socket socket; // 네트워크 주소를 저장하고 있는 메모리 주소
    int[] arr;
    
  }
}