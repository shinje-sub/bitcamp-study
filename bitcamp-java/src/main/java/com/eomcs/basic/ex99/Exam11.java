package com.eomcs.basic.ex99;

public class Exam11 {
  public static void main(String[] args){
    // 값 출력하기
    // println() 사용법
    // => 값 출력 할때 '줄바꿈' 
    System.out.println(100); 
    System.out.println(3.14);
    System.out.println(true);
    System.out.println('가');
    System.out.println("안녕!");
   
    System.out.println();
    // print() 사용법
    // => '값'만 출력 함
    System.out.print(100); 
    System.out.print(3.14);
    System.out.print(true);
    System.out.print('가');
    System.out.print("안녕!");
    
    System.out.print('\n');
    
    System.out.print("OK!\n");
    System.out.print("NO!");
    
    System.out.println();
    // printf() 사용법
    // => printf("형식", 값1, 값2 .....)
    // => printf(안에 넣을 때는 문자열은 %d 숫자는 %s)
    System.out.printf("\n이름: %s", "홍길동");
    System.out.printf("\n나이: %d", 20);

    System.out.printf("\n이름(나이): %s(%d)", "홍길동", 20);

    //정수 삽입
    // %d : decimal
    // %x : hexadecimal
    // %c : char
    System.out.printf("\n %d, %x, %c", 65, 65, 65);
    
    // 삽임될 값 지정하기
    // => %값위치$d
    // 값위치는 1부터 시작
    System.out.printf("\n %1$d, %1$x, %1$c", 65);

    // 논리 값 삽입
    System.out.printf("\n재직자: %s %b",true, true);
    System.out.printf("\n나이: %s %d", 20, 20);
    System.out.println();
    
    // 출력할 공간 확보
    System.out.printf("\n이름: [%s]" ,"홍길동"); 
    System.out.printf("\n이름: [%20s]" ,"홍길동"); // 오른쪽 정렬
    System.out.printf("\n이름: [%-20s]" ,"홍길동");// 왼쪽 정렬
    
    System.out.println();
    
    System.out.printf("\n숫자: [%d]" ,12345);// 
    System.out.printf("\n숫자: [%10d]" ,12345);// 오른쪽 정렬
    System.out.printf("\n숫자: [%-10d]" ,12345);// 왼쪽 정렬
    System.out.printf("\n숫자: [%010d]" ,12345);// 빈 공간이 0으로 채워짐
    System.out.printf("\n숫자: [%+010d],[%+010d]", 12345, -12345); // 결과 :[+000012345],[-000012345]
    System.out.println();
    
    // 일시(날짜와 시간) 다루기
    
    java.util.Date today = new java.util.Date(); // 현재 시간 알림
    today.setDate(9); // Deprecated : 앞으로 없어질 기능
   
    System.out.printf("\n%s ",today); //Thu Dec 12 12:05:18 KST 2019
    
    // 날짜 객체에서 년,월,일,시,분,초,요일 추출하기
     
    System.out.printf("\n%tY, %ty",today, today); // 년도 추출 대문자는 4자리 소문자는 앞에 2자리만 추출 :'2019, 19'
    System.out.printf("\n%tB, %tb",today, today); // 월 추출 (문자도) :'12월, 12월'
    System.out.printf("\n%tm", today); // 월 추출(숫자만):'12'
    System.out.printf("\n%td, %te", today, today); // 일 추출 => d:앞자리가 하나면 0을 붙이는 기능
    System.out.printf("\n%tA, %ta", today, today); // 요일 추출 => 대문자는 '월요일' 소문자는 '월'
    System.out.printf("\n%tH, %tI", today, today); // 시각 추출 => H: 24시간으로 I: 한시
    System.out.printf("\n%tM", today); // 분 추출
    System.out.printf("\n%tS, %tL,%tN", today, today, today); // 초, 밀리초, 나노초
    System.out.printf("\n%tp, %Tp",today, today); // 오전 / 오후 pm, PM
    System.out.println();
    
    //2019-12-12 12:37:45
    // $1은 하나씩 나눌수 있다.
    System.out.printf("\n%1$tY-%1$tm-%1$td %1$ta:%1$tH:%1$tM:%1$TS", today);//=>2019-12-09-Mon:12:43:46
    
   String str; // 하나의 문자를 출력할수 있다.

   str = String.format("\n%1$tY-%1$tm-%1$td %1$ta:%1$tH:%1$tM:%1$TS", today);
   System.out.println(str);
  }
}