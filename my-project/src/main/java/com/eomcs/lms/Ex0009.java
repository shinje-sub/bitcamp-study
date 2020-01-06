// Strirng 배열
package com.eomcs.lms;

public class Ex0009 {

  public static void main(String[] args) {


    String[] arr;         
    // String 배열 객체의 주소를 담을수 있는 레퍼런스 변수 선언
    
    arr = new String[5]; 
    // Heap 영역에 Stirng 객체의 주소를 담을 수 있는 공간 5개를 만들고 
    // 해당 공간 전체(스트링 배열 주소)를 arr에 저장

    arr[0] = new String ("ABCD");
    System.out.print(arr[0]);
  }
}