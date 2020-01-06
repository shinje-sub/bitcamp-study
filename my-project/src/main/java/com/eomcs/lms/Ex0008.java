// 배열의 초기화
package com.eomcs.lms;

public class Ex0008 {

  public static void main(String[] args) {

    Student0 s1 = new Student0("khy", "2020");

    Student0[] sArr = new Student0[5];
    // [String] [String] [String] [String] [String] // 각각의 값이 주소가 들어간다.
    sArr[0] = s1;
    sArr[1] = new Student0("aaa" , "2111");
  }
}

class Student0 { 
  String name;
  String sNum;
  public Student0(String name , String sNum) {
    this.name = name;
    this.sNum = sNum;
  }
}