package com.eomcs.basic.ex99;

public class Exam22 {
  public static void main(String[] args){
  // 키보드 정보를 가져온다.
  java.io.InputStream keyboard = System.in;
  //java.io.PrintStream console = System.out;
    
  // 키보드 객체에 정수, 부동소수점, 논리값, 문자열을 끊어서 읽어 주는 
  // 도우미 객체 붙인다.
  // 엔터를 치면 리턴하여 문자열로 화면에 보여주고 엔터 하기전까지는 계속 작성 가능하다.
  java.util.Scanner scanner = new java.util.Scanner(keyboard); // new 도구 생성 메모리 스캐너 도구 생성
  
  System.out.print("입력>");
  int i1= scanner.nextInt(); 
  int i2= scanner.nextInt();
  int i3= scanner.nextInt();
  
  System.out.println("------------------------------------");
  System.out.println(i1);
  System.out.println(i2);
  System.out.println(i3);

  // nextInt()
  // => space, tap, new line을 만나면, 그 앞까지 입력한 문자열을
  //   int 값으로 바꿔 리턴한다.
  // => 입력한 문자열이 숫자를 의미하는 문자열이 아니라면
  //    int 값으로 바꿀수 없기 떄문에 실행 오류가 발생한다.
 }
}