package com.eomcs.basic.ex04;

public class Exam41 {
  public static void main(String[] args){
   // 문자 변수
   // ''은 문자코드 값(UCS-2) 을 출력한다.
   
   short s;
   char c;

   s = -32768;
   s = 32767;
   
   /*s = -32769;
   s = 32768;*/ //값이 1이라도 높으면 에러가 생긴다.

   c = 0;
   c = 65535;
   
   /*c = -1;
   c = 65536;*/ // 유효범위 값이 1이라도 높거나 낮으면 에러가 발생한다.
   
    char c1 = 65;
    char c2 = 0x41;
    char c3 = 0b0100_0001;
    char c4 = 'A'; // 문자에 부여된 문자코드(UCS-2)를 출력한다.  
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3); // 문자로 출력
    System.out.println(c4); // 문자에 부여된 문자코드값을 출력한다.
    
    System.out.println();
    int i1 = 65;
    int i2 = 0x41;
    int i3 = 0b0100_0001;
    int i4 = 'A';
    i4 = i4 +10;
   
    System.out.println(i1);
    System.out.println(i2);
    System.out.println(i3); // 숫자로 출력
    System.out.println((char)i4); // char가 들어가면 문자로 출력가능하다.
    System.out.println();
   
    for (int i = 65; i < 'A' + 26; i++)
    System.out.print((char)i); // char가 들어가면 문자로 출력
  
  
  
  
  }
}