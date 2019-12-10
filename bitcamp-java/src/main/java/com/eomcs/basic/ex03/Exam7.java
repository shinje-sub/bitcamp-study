package com.eomcs.basic.ex03;

// 이스케이프 문자(escap character)
public class Exam7 {
  public static void main(String[] args) {
    // 이스케이프 문자
    // - 문자를 제어하는 기능을 가진 문자
    // - 문법 
    //   \ [ n | r | f | t | b | '' |"" | \ ] 

    
    System.out.println("Hello, world!");
    System.out.println("Hello,\nworld!"); // 줄바꿈 문자 : \n
    System.out.println("Hello,\rabc"); // 커서(cursor)를 처음으로 돌리는 문자 : \r(리턴)
    // 커서란? 문자를 출력할 위치를 가리키는 것.
    
    System.out.println("Hello,\b\b\bworld!"); // 커서를 뒤로 한칸이동 시키는 문자 : \d\d
    System.out.println("Hello,\tworld!"); // 탭 공간을 추가시키는 문자 : \t(기본적으로 2칸)
    System.out.println("Hello,\fworld!"); // formfeed 추가시키는 문자 : \f
    System.out.println("Hello,\'w'orld!"); // " "안에서를 추가시키는 문자
    System.out.println("Hello,'w'orld");  //  ""안에서 ' 문자는 그냥 출력한다 
    System.out.println('\''); //''안에서 ' 문자를 출력시키는문자
    System.out.println('"'); // ''안에서 "문자는 그냥 적는다.
    System.out.println("c:\\Users\\user\\git"); // \문자를 출력시키는 문자


  }
}

// 줄 바꿈 코드
// Craage Return(CR) : 0d
// Line Feed(LF) : 0a
// 
// - Winodws OS 에서는 줄 바꿈을 표시하기 위해
//   CRLF 2바이트 코드를 삽입한다.
// - Unix OS 에서는 줄바꿈을 표시하기 위해
//   LF 1바이트 코드를 삽입한다.
   